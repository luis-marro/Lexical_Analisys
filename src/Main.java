import Lexical.Analyzer_GUI;
import Lexical.Lexical;
import Lexical.Syntax_GUI;
import java_cup.runtime.*;
import Lexical.*;

import java.io.FileReader;
import java.util.Scanner;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        {

            // start GUI
            //Syntax_GUI syntaxGui = new Syntax_GUI();
            //syntaxGui.setVisible(true);

            // console test cup
            System.out.println("Ingrese la ruta del archivo a convertir ");
            Scanner inputReader = new Scanner(System.in);
            String path = inputReader.nextLine();
            FileManager manager = new FileManager();
            if (manager.trimFile(path)) {
                String options[] = new String[7];
                options[0] = "-destdir";
                options[1] = "D:\\Mis Documentos\\Universidad\\Progra\\Box Sync\\Compiladores\\Proj_Fase#1\\Lexical_Analisys\\src\\Lexical";
                options[2] = "-symbols";
                options[3] = "minc#Parser";
                options[4] = "-parser";
                options[5] = "Parser";
                options[6] = "D:\\Mis Documentos\\Universidad\\Progra\\Box Sync\\Compiladores\\Proj_Fase#1\\Lexical_Analisys\\src\\Lexical\\Parser.cup";
                try {
                    java_cup.Main.main(options);
                    System.out.println("Se genero el codigo exitosamente");
                    // succes, generate the lexee
                    //Lexical lexical  = new Lexical();
                    //Yylex scanner = new Yylex(new FileReader(path));
                    // Parse the file
                    // Parser par = new Parser(scanner);

                } catch (Exception e) {

                }

            }else {
                System.out.println("El archivo seleccionado no existe");
            }
        }
    }
}
