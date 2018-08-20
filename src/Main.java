import Lexical.Lexical;
import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        {
            Scanner reader = new Scanner(System.in);
            System.out.println("Introduzca la ruta del archivo");
            String file = reader.nextLine();

            Lexical lex = null;

            try {
                lex = new Lexical();
                System.out.println("Se ha generado el analyzador lexico");

                lex.transform(file);
                System.out.println("Se ha analizado el archivo");

            } catch (IOException e) {

            }
        }
    }
}
