/**
 * Defines an exception that is thrown when an operation can not be completed.
 * @author Adam Khoukhi
 * @version 1.0
 */
public class MyBagRuntimeException extends RuntimeException {

    /**
     * Generated serialversionuID for a warning exception
     */
    private static final long serialVersionUID = -7271747705282670633L;

    /**
     * Constructs an object with a specific message.
     * 
     * @param message A string literal specifying the details of this exception
     */   
    public MyBagRuntimeException(String message){
        super(message);

    }
}
