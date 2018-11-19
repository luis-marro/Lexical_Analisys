import java.util.*;

/**
 * Class that will manage the language symbol table
 * It has a structure of multiple chained tables, like in a linked list but pointing backwards, where
 * each node is a different scope. Search allows to find a symbol in local scope and in
 * father scope.
 */
public class symbolTable {

    static symbolTable root = new symbolTable(null); // Reference to the root environment
    static symbolTable top = root; // Reference to the current environment
    HashMap table;
    symbolTable previous;
    int counter = 0;

    public symbolTable(symbolTable st){
        table = new HashMap();
        previous = st;
    }

    /**
     * This method adds a new entry to the root scope. It should be a class name.
     * @param className The name of the class to be inserted
     * @param superClass The name of a class the current one "extends"
     * @param s the value to insert
     * @return
     */
    public static int insertClass(String className, String superClass, sym s){
        if(root.table.containsKey(className)){ System.out.print("Entrada a Clase : " + className);
            push();
            return 1;
        }
        if(superClass == null){
            root.table.put(className, s);
            System.out.print("Entrada a Clase: " + className);
            top.table.put(className, s);
            push();
            return 0;
        }
        if(!root.table.containsKey(superClass)){ System.out.print("Entrada a Clase: " + className);
            push();
            return 2;
        }
        else {
            root.table.put(className, s);
            System.out.print("Entrada a Clase: " + className);
            top.table.put(className, s);
            push();
            return 0;
        }
    }

    /**
     * Public method to insert in the Symbol Table. Uses as default top table
     * @param name Name of the identifier to add (key)
     * @param s The whole symbol to insert as value
     * @return
     */
    public static boolean insert(String name, sym s){
        if(!top.table.containsKey(name)){
            top.table.put(name, s);
            System.out.println("   Nuevo Identificador: " + name + " Ambito actual: " + top);
            return true;
        }
        System.out.println("El simbolo ya " + name + " ya fue declarado en el ambito");
        return false;
    }

    /**
     * Mehthod to search for a symbol.
     * It searches from the current table down to the root table, passing through all the outer scopes of the current scope.
     * @param name
     * @return
     */
    public static sym search(String name){
        for(symbolTable ST = top; ST != null; ST = ST.previous){
            sym found = (sym)ST.table.get(name);
            if(found != null)
                return found;

        }
        return null;
    }

    /**
     * Use the tables in a stack like structure
     * Pushing a new table is like going in a new scope inside the last one
     */
    public static void push(){
        top = new symbolTable(top);
        System.out.println(" Ambito Actual: " + top);

    }

    /**
     * Use the tables in a stack like structure
     * Called when going out of a scope, going back to previus table (scope)
     */
    public static void pop(){
        top = top.previous;
        System.out.println(" Ambito Actual: " + top);
    }

    /**
     * Override to .toString()
     * @return
     */
    public String toString(){
        if(previous != null)
            return previous.toString();
        else
            return " " + table;
    }


}
