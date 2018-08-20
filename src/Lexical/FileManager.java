package Lexical;
import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileManager {

    /*
    Class constructor
     */
    public FileManager(){

    }

    public void writeNewFile(String path, List<String> tokens){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Mis Documentos\\Universidad\\Progra\\Box Sync\\Compiladores\\Proj_Fase#1\\Lexical_Analisys\\output.out"));
            // Print the tokens to the file
            for(int i = 0; i < tokens.size(); i++){
                writer.write(tokens.get(i) + "\n");
            }
            // close the file
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
