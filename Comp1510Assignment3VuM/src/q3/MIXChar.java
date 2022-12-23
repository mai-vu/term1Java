package q3;

/** represent a single MIXChar character.
 * @author Mai Vu
 * @version 1.0
 *
 */
public class MIXChar {
    
    /** number of MIX characters. */
    public static final int NUMCHAR = 56;
    
    /** MIX characters array. */
    public static final char[] MIXCHARLIST = {' ', 'A', 'B', 'C', 'D', 'E', 
        'F', 'G', 'H', 'I', 'Δ', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 
        'R', 'Σ', 'Π', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', 
        '1', '2', '3', '4', '5', '6',  '7', '8', '9', '.', ',', 
        '(', ')', '+', '-', '*', '/', '=', '$', '<', '>', '@', 
        ';', ':', '\''};

    /** Value of the MIXChar character. */
    private int charVal;
    
    /** MIXChar character. */
    private char c;
    
    /** Constructors a MIXChar object converts c to the corresponding MIXChar,
     * with exception thrown if conversion not possible.
     * @param c character
     */
    public MIXChar(char c) {
        if (isMIXChar(c)) {
            for (int i = 0; i < NUMCHAR; i++) {
                if (c == MIXCHARLIST[i]) {
                    this.charVal = i;
                    this.c = c; 
                    break;
                }         
            }
        } else {
            throw new IllegalArgumentException("Not a MIXChar character");
        }
    }
    
    static boolean isMIXChar(char c) throws IllegalArgumentException {
        boolean b = false;
        for (int i = 0; i < NUMCHAR; i++) {
            if (c == MIXCHARLIST[i]) {
                b = true;
                break;
            }
        }
        return b; 
    }

    static String toString(MIXChar[] arr) throws IllegalArgumentException {
        String s = "";
        for (MIXChar c : arr) {
            s += c + " ";
        }
        return s;
    }
    
    static MIXChar[] toMIXChar(String s) {
        MIXChar[] arrMIXChar = new MIXChar[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (!isMIXChar(s.charAt(i))) {
                System.out.println("Input contains non MIXChar characters!");
                System.out.println("List of MIXChar char: ");
                for (char c : MIXCHARLIST) {
                    System.out.print(c + " ");
                }
                System.out.println();
                throw new IllegalArgumentException();
            } else {               
                arrMIXChar[i] = new MIXChar(s.charAt(i));
            }          
        }
        return arrMIXChar;   
    }
    
    /**  converts this MIXChar character to corresponding Java char. 
     * @return java character
     */
    public char toChar() throws IllegalArgumentException {
        char ch = MIXCHARLIST[charVal];
        return ch;      
    }
    
    /** return the numerical value of this MIXChar. 
     * @return value of MIXChar character */
    public int ordinal() throws IllegalArgumentException {
        return charVal;      
    }
    
    /** returns string containing this MIXChar as a Java char. 
     * @return String */
    public String toString() throws IllegalArgumentException {
        String s = "";
        s += c;
        return s;
        
    }
    
}
