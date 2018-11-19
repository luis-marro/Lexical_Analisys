import java_cup.internal_error;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Generar el Parser");

        //region Code area to compile cup
        String cupPath = "src/Parser.CUP";
        String options[] = new String[3];
        options[0] = "-parser";
        options[1] = "syntaxAnalyzer";
        options[2] = cupPath;
        try{
            java_cup.Main.main(options);
        }catch (IOException eio){
            System.out.println("error de IO al generar el parser");
        } catch (java_cup.internal_error internal_error) {
            internal_error.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //endregion

        //region Region to compile Flex file
        /*System.out.println("Inicio de la compilacion de jflex");
        //jflex.Main.generate(new String[]{"src/Lexer.flex"});
        jflex.Main.main(new String[]{"src/Lexer.flex"});
        System.out.println("Se genero el analizador lexico con exito");*/
        //endregion

        // test the generated parser
        System.out.println("Ingrese la ruta del archivo a convertir ");
        Scanner inputReader = new Scanner(System.in);
        String path = inputReader.nextLine();
        FileManager.trimFile(path);
        BufferedReader reader = null;
        symbolTable.insertClass("hola", null, null); 
        try {
            reader = new BufferedReader(new FileReader(path));
            Yylex lex = new Yylex(reader); // Lexical analyzer to use in the parser
            syntaxAnalyzer parser = new syntaxAnalyzer(lex);
            parser.parse();

            if(parser.errors == 0){
                System.out.println("sin errores sintacticos");
            }

            // TODO: Fix some random error in the parser
            // TODO: Add the symbol table to the if, while, for scope

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
