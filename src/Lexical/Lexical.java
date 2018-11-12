package Lexical;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Lexical {

    private String finalPath;
    private List<String> errors;

    // class constructor
    public Lexical() throws IOException{
        jflex.Main.generate(new File("src/Lexical/Lexer.flex"));
    }

    public List<String> getErrors(){
        return errors;
    }

    public String getFinalPath(){
        return finalPath;
    }

    // Method that analyzes a file collecting tokens until the end is reached.
    public void transform(String input) throws IOException{
        FileManager manager = new FileManager();
        //List<java_cup.runtime.Symbol> output = new LinkedList<java_cup.runtime.Symbol>();
        manager.trimFile(input);
        finalPath = manager.getFinalPath();
        try{
            Yylex lex = new Yylex(new FileReader(input));
            java_cup.runtime.Symbol token;
            token = lex.next_token();

            while(token != null){
                //output.add(token);
                token = lex.next_token();
            }
            errors = lex.getError();
        }catch (IOException ex){
            System.out.println("Trono");
        }

    }


}
