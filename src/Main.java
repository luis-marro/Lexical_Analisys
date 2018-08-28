import Lexical.Analyzer_GUI;

public class Main {
    public static void main(String[] args) {
        {
            //Scanner reader = new Scanner(System.in);
            //System.out.println("Introduzca la ruta del archivo");
            //String file = reader.nextLine();

            // start GUI
            Analyzer_GUI gui = new Analyzer_GUI();
            gui.setVisible(true);

            /*
            Lexical lex;

            try {
                lex = new Lexical();
                System.out.println("Se ha generado el analyzador lexico");

                lex.transform(file);
                System.out.println("Se ha analizado el archivo");

            } catch (IOException e) {

            }*/
        }
    }
    //TODO
    /*
       add error handling for multiline comments with errors
       Fix error with strings as method parameters
       add GUI
    */
}
