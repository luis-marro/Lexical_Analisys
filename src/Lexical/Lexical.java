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
        jflex.Main.generate(new File("src/Lexical/lexer.flex"));
    }

    public List<String> getErrors(){
        return errors;
    }

    public String getFinalPath(){
        return finalPath;
    }

    // Method that analyzes a file collecting tokens until the end is reached.
    public List<String> transform(String input) throws IOException{
        FileManager manager = new FileManager();
        List<String> output = new LinkedList<String>();
        manager.trimFile(input);
        finalPath = manager.getFinalPath();
        try{
            Yylex lex = new Yylex(new FileReader(input));
            String token;
            token = lex.yylex();

            while(token != null){
                output.add(token);
                if(token.contains("not closed comment"))
                    break;
                token = lex.yylex();
            }
            errors = lex.getError();
        }catch (IOException ex){
            System.out.println("Trono");
        }

        manager.writeNewFile(input, output);
        return output;
    }


}
