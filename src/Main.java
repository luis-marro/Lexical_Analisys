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
    //TODO
    /* fix reserved words like class and int
       make the output path depend on the input path
       test other regular expressions
       fix whitespace recognized as invalid token
       make output file more homogeneous looking
    */
}
