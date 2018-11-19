import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class FileManager {

    public FileManager(){

    }

    public static void trimFile(String path){
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
}
