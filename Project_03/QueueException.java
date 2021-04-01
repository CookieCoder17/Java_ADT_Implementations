/**
 * An exception class that extends the RuntimeException with a specified message
 * 
 * @author Adam Khoukhi
 * @version 1.0
 */

public class QueueException extends RuntimeException {

    /**
     * Default generated serial version id
     */
    private static final long serialVersionUID = 1L;

    /**
     * Constructs an exception with a specified message.
     * 
     * @param message The specified message of this exception
     */
    public QueueException(String message) {
        super(message);
    }

}
