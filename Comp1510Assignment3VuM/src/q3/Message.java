package q3;


/**  represents a packed string of MIXChar's.
 * @author Mai Vu
 * @version 1.0
 */
public class Message {
    
    /** count of how many characters are in the message object. */
    private int count;
    
    /** max characters stored in a long. */
    private final int charPerLong = 11;
    
    /** length of long[] array. */
    private int arrLength;
    
    /** long[] packed 11 MIXChar characters per long maximum. */
    private long[] arrMIXCharLong;
    
    /** string message. */
    private String mString;
    
    
    /** Message Constructor taking a MIXChar array as a parameter. 
     * @param m MIXChar array
     */
    public Message(MIXChar[] m) throws IllegalArgumentException { 
        this.mString = MIXChar.toString(m);
        this.toLongArr(m);
        this.count = m.length;
        this.arrLength = arrMIXCharLong.length;    
    }
    
    /** Message Constructor taking a MIXChar String as a parameter. 
     * @param s String of MIXChar
     */
    public Message(String s) throws IllegalArgumentException {
        this.mString = s;
        MIXChar[] arrMIXChar = MIXChar.toMIXChar(s);
        this.toLongArr(arrMIXChar);
        this.count = arrMIXChar.length;
        this.arrLength = arrMIXCharLong.length; 
    }
    
    /** Support Method to convert MIXChar array to a long array that 
     * packed 11 MIXChar characters per long. 
     * @param mArr MIXChar array
     * @return array of long
     */
    private long[] toLongArr(MIXChar[] mArr) {
        this.count = mArr.length;
        this.arrLength = (int) Math.ceil((double) count / charPerLong); 
        int remainder = count % charPerLong;
        int i = 0;
        int k = 0;
        this.arrMIXCharLong = new long[arrLength];
        for (int o = 0; i < count; i = i + charPerLong, o++) {  
            long longElement = 0;           
            for (int j = charPerLong - 1; j >= 0 
                    && i + remainder < count; j--, k++) {
                longElement += (long) mArr[k].ordinal() 
                        * (long) Math.pow(MIXChar.NUMCHAR, j);
            }
            this.arrMIXCharLong[o] = longElement;
            longElement = 0; 
            if (count == remainder || i ==  count - remainder) { 
                k = i;
                for (int j = remainder - 1; j >= 0; j--, k++) {
                    longElement += (long) mArr[k].ordinal() 
                            * (long) Math.pow(MIXChar.NUMCHAR, j);
                }
                this.arrMIXCharLong[arrLength - 1] = longElement;
            }
        }
        return this.arrMIXCharLong;       
    }
        
    /** returns a string corresponding to the characters in the message. 
     * @return message String
     */
    public String toString() {
        return this.mString;    
    }
    
    /** returns a string which is the instance long[] formatted  as
     *  unsigned integers and separated by spaces. 
     *  @return String of Binary separated by space*/
    public String toLongs() {
        String s = "";
        for (long longElement : this.arrMIXCharLong) {
            s += Long.toUnsignedString(longElement) + " ";
        }
        return s;       
    }
    
}
