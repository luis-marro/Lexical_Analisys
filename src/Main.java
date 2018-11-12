import Lexical.Analyzer_GUI;
import Lexical.Lexical;
import Lexical.Syntax_GUI;
import java_cup.runtime.*;
import Lexical.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        {
            List<String> lexErrors = null;
            List<String> syntaxErrors = null;
            FileManager manager = new FileManager();
            String cupPath = "src/Lexical/Parser.CUP";
            String options[] = new String[3];
            options[0] = "-parser";
            options[1] = "syntaxAnalizer";
            options[2] = cupPath;
            try {
                System.out.println("Generando el analizador lexico");
                jflex.Main.generate(new File("src/Lexical/Lexer.flex"));
                System.out.println("Se genero el analizador lexico");
                System.out.println("Empezando la compilacion del archivo Cup");
                //java_cup.Main.main(options);
                System.out.println("Se genero el codigo exitosamente");
                System.out.println("Ingrese la ruta del archivo a convertir ");
                Scanner inputReader = new Scanner(System.in);
                String path = inputReader.nextLine();
                // Begin the analysis of the file
                manager.trimFile(path);
                BufferedReader reader = new BufferedReader(new FileReader(path));
                Yylex lex = new Yylex(reader);
                /*
                syntaxAnalizer parser = new syntaxAnalizer(lex);
                // parser the file
                parser.parse();

                lexErrors = lex.getError();
                syntaxErrors = parser.syntaxErrors;

                // Finally, print the values
                if(lexErrors.size() > 0) {
                    for (int i = 0; i < lexErrors.size(); i++) {
                        System.out.println(lexErrors.get(i));
                    }
                }

                if(syntaxErrors.size() > 0){
                    for(int i = 0; i < syntaxErrors.size(); i++){
                        System.out.println(syntaxErrors.get(i));
                    }
                }*/

            System.out.println("Termino con exito");
            } catch (Exception e) {
                System.out.println("Error al procesar el archivo");
            }

        }
    }
}
