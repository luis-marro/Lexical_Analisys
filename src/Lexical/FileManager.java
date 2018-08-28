package Lexical;
import org.apache.commons.io.FilenameUtils;
import java.io.*;
import java.util.List;
import java.util.LinkedList;

public class FileManager {


    private String finalPath;

    public String getFinalPath(){
        return finalPath;
    }

    /*
    Class constructor
     */
    public FileManager(){

    }

    public void trimFile(String path){
        File file = new File(path);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            List<String> allLines = new LinkedList<String>();
            while((line = reader.readLine()) != null){
                allLines.add(line.trim());
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for(int i = 0; i < allLines.size(); i++){
                writer.write(allLines.get(i) + "\n");
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeNewFile(String path, List<String> tokens){
        try {
            String extension = FilenameUtils.getExtension(path);
            finalPath = path.replace(extension, "out");
            BufferedWriter writer = new BufferedWriter(new FileWriter(finalPath));
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
