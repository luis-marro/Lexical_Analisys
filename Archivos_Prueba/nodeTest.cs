using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace CompressionDLL
{
public class HuffmanNode
{
public byte symbol { get; set; }
public int frequency { get; set; }
public HuffmanNode rightNode { get; set; }
public HuffmanNode leftNode { get; set; }

public HuffmanNode(byte symbol, int frequency, HuffmanNode right, HuffmanNode left)
{
this.symbol = symbol;
this.frequency = frequency;
rightNode = right;
leftNode = left;
}

/// <summary>
/// This method return the prefix of a node or character
/// </summary>
/// <param name="character"></param>
/// <param name="data"></param>
/// <returns></returns>
public List<bool> TraverseNode(byte character, List<bool> data)
{
// Check if the node is a leaf
if (leftNode == null && rightNode == null)
{
if (character == symbol)
return data;
else
return null;
}
else
{
// lists that will save the obtained preffixes
List<bool> left = null;
List<bool> right = null;

// get the left side
if (leftNode != null)
{
List<bool> leftPath = new List<bool>();
leftPath.AddRange(data);
// Add a false value because of left movement
leftPath.Add(false);

left = leftNode.TraverseNode(character, leftPath);
}
// same thing but with the rigth side
if (rightNode != null)
{
List<bool> rigthPath = new List<bool>();
rigthPath.AddRange(data);
rigthPath.Add(true);

right = rightNode.TraverseNode(character, rigthPath);
}

if (left != null)
return left;
else
return right;
}
}
}
}
