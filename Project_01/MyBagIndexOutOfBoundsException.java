/**
 * Defines an exception that is thrown when an index is out of bound.
 * @author Adam Khoukhi
 * @version 1.0
 */
public class MyBagIndexOutOfBoundsException extends IndexOutOfBoundsException{

    /**
     * Generated serialversionuID for a warning exception
     */
    private static final long serialVersionUID = -3662000904357982565L;

    /**
     * Constructs an object with a specific message.
     * 
     * @param message A string literal specifying the details of this exception
     */   
    public MyBagIndexOutOfBoundsException(String message) {
        super(message);
    }
}