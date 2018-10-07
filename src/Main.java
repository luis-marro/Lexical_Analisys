import Lexical.Analyzer_GUI;
import Lexical.Syntax_GUI;

public class Main {
    public static void main(String[] args) {
        {

            // start GUI
            Syntax_GUI syntaxGui = new Syntax_GUI();
            syntaxGui.setVisible(true);

        }
    }
    //TODO
    /*
       add error handling for multiline comments with errors
       Fix error with strings as method parameters
       add GUI
    */
}
