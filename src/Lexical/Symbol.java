package Lexical;

public class Symbol {

    /**
     * Constructor having left and right values
     * @param id
     * @param l
     * @param r
     * @param o
     */
    public Symbol(int id, int l, int r, Object o) {
        this(id);
        left = l;
        right = r;
        value = o;
    }

    /**
     * Constructor without left and right values
     * @param id
     * @param o
     */
    public Symbol(int id, Object o) {
        this(id, -1, -1, o);
    }

    /**
     * Constructor without new object
     * @param id
     * @param l
     * @param r
     */
    public Symbol(int id, int l, int r) {
        this(id, l, r, null);
    }

    /**
     * Constructor with no left and right
     * @param sym_num
     */
    public Symbol(int sym_num) {
        this(sym_num, -1);
        left = -1;
        right = -1;
        value = null;
    }

    /**
     * Constructor for a begin stete
     * @param sym_num
     * @param state
     */
    Symbol(int sym_num, int state)
    {
        sym = sym_num;
        parse_state = state;
    }


    //The symbol number of the terminal or non terminal being represented
    public int sym;

    /** The parse state to be recorded on the parse stack with this symbol.
     *  This field is for the convenience of the parser and shouldn't be
     *  modified except by the parser.
     */
    public int parse_state;
    /** This allows us to catch some errors caused by scanners recycling
     *  symbols.  For the use of the parser only. */
    boolean used_by_parser = false;


    // Data passed to the parser
    public int left, right;
    public Object value;

    // Printing a token
    public String toString() {
        return "#"+sym;
    }
}
