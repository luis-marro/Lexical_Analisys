using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;

namespace EncryptionDLL
{
public class ElGamal
{
// Prime number used by the receptor
private ulong primeNumber;
// Receptor random number
private int receptorRandom;
// Receptor private key
private int receptorPrivateKey;
// K number for the receptor
public ulong receptorK;
// Array that contains the public key
public ulong[] publicKey;
// Sender random number
public ulong senderB;
// hash of the text or file
public ulong senderM;
// First part of the cyphered tuple
private ulong senderY1;
// Second part of the cyphered tuple
private ulong senderY2;
// The cyphered tuple
public ulong encryptedKey;
public List<ulong> cypheredBytes;
private string extension;

// Constructor
public ElGamal()
{
// Set a large prime number
List<int> temp = GeneratePrimesSieveOfEratosthenes(1000);
// Set a large prime number
primeNumber = (ulong)temp[temp.Count - 1]; // 32 bits
receptorRandom = 4;
senderB = (ulong)3;
// Set the receptor private key
receptorPrivateKey = 31;
publicKey = new ulong[3];
cypheredBytes = new List<ulong>();
}

#region Find Large Prime Number
// This methods uses the Sieve of Eratosthenes to get all the prime numbers up to a limit
// The algorithm basically iterates over a list, starting at two, then marks all the 2nd position counting from the last maeked
// Then, goes to three and marks all the third position counting from the last third, it does this until all positions are marked
// The algorithm finishes and the non marked numbers left are the prime numbers.

public static int ApproximateNthPrime(int nn)
{
double n = (double)nn;
double p;
if (nn >= 7022)
{
p = n * Math.Log(n) + n * (Math.Log(Math.Log(n)) - 0.9385);
}
else if (nn >= 6)
{
p = n * Math.Log(n) + n * Math.Log(Math.Log(n));
}
else if (nn > 0)
{
p = new int[] { 2, 3, 5, 7, 11 }[nn - 1];
}
else
{
p = 0;
}
return (int)p;
}

/// <summary>
/// This method finds all the prime numbers up to and including the limit
/// </summary>
/// <param name="limit"></param>
/// <returns></returns>
public static System.Collections.BitArray SieveOfEratosthenes(int limit)
{
BitArray bits = new BitArray(limit + 1, true);
bits[0] = false;
bits[1] = false;
for (int i = 0; i * i <= limit; i++)
{
if (bits[i])
{
for (int j = i * i; j <= limit; j += i)
{
bits[j] = false;
}
}
}
return bits;
}

/// <summary>
/// This method gets the primes of the bit array, taking the non marked positions.
/// </summary>
/// <param name="n"></param>
/// <returns></returns>
public static List<int> GeneratePrimesSieveOfEratosthenes(int n)
{
int limit = ApproximateNthPrime(n);
BitArray bits = SieveOfEratosthenes(limit);
List<int> primes = new List<int>();
for (int i = 0, found = 0; i < limit && found < n; i++)
{
if (bits[i])
{
primes.Add(i);
found++;
}
}
return primes;
}
#endregion

/// <summary>
/// This method calculates and assembles the public key
/// </summary>
private void GetPublicKey()
{
receptorK = (ulong)Math.Pow((double) receptorRandom, (double) receptorPrivateKey) % primeNumber;
// build the public key (prime, random, k)
publicKey[0] = primeNumber;
publicKey[1] = (ulong) receptorRandom;
publicKey[2] = receptorK;
}

// Here goes the method to get the hash of the file and/or string

/// <summary>
/// This method cifers a file or string by bytes, byte for byte
/// </summary>
/// <param name="toCipher"></param>
/// <returns>THe hass code of the file or string</returns>
public void Cipher(byte[] toCypher, string filePath)
{
GetPublicKey();
senderY1 = (ulong)Math.Pow(publicKey[1], senderB) % primeNumber;
foreach (var number in toCypher)
{
senderY2 = (ulong)(Math.Pow(publicKey[2], senderB) * number) % primeNumber;
cypheredBytes.Add(senderY2);
}
// Get the extension
string[] separatePath = filePath.Split('.');
extension = "." + separatePath[separatePath.Length - 1];
using (StreamWriter writer = new StreamWriter(filePath.Replace(".txt", ".cif")))
{
// Write the file extension
writer.WriteLine(extension);
// The first line will be the key
writer.WriteLine(senderY1);
// Write all the cyphered bytes
foreach (var cyphered in cypheredBytes)
{
writer.Write(cyphered);
writer.Write(" ");
}
}
}

/// <summary>
/// This method decrypts a file and writes it as it was originally
/// </summary>
/// <param name="fileName"></param>
public void DecryptFile(string fileName)
{
// List to hold all the read bytes
List<byte> readBytes = new List<byte>();

// First read the file to decrypt all the file
using (StreamReader reader = new StreamReader(fileName))
{
// Read the original file extension
extension = reader.ReadLine();
// read the key
int key = int.Parse(reader.ReadLine());
// Begin reading and decrypting the bytes
string[] separated = reader.ReadLine().Split(' ');
foreach (var value in separated)
{
if (value != "")
{
readBytes.Add(FermatTheorem(int.Parse(value), key));
}
}
}

// Write the original file again
File.WriteAllBytes(fileName.Replace(".cif", "Decrypted" + extension), readBytes.ToArray());
}

private byte FermatTheorem(int toDecrypt, int key)
{
int exponent = (int)primeNumber - 1 - receptorPrivateKey;
// Calculate the power manually as Math.pow isn't enough for the big number
BigInteger result = new BigInteger(key);
for (int i = 0; i < exponent; i++)
{
result *= result;
}
result = result * toDecrypt;
result = result % primeNumber;
return (byte) result;

}

}
}
