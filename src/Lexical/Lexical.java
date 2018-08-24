package Lexical;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import jflex.*;

public class Lexical {

    // class constructor
    public Lexical() throws IOException{
        jflex.Main.generate(new File("src/Lexical/lexer.flex"));
    }

    // Method that analyzes a file collecting tokens until the end is reached.
    public List<String> transform(String input) throws IOException{
        FileManager manager = new FileManager();
        List<String> output = new LinkedList<String>();
        manager.trimFile(input);

        try{
            Yylex lex = new Yylex(new FileReader(input));
            String token;
            token = lex.yylex();

            while(token != null){
                output.add(token);

                token = lex.yylex();
            }
        }catch (IOException ex){
            System.out.println("Trono");
        }

        manager.writeNewFile(input, output);
        return output;
    }

}
