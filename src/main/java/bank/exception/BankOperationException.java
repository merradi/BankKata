package bank.exception;

public class BankOperationException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default constructor
	 */
	public BankOperationException() {

	}

	/**
	 * Message exception constructor
	 * 
	 * @param message
	 *            : the message already formated for this exception
	 */
	public BankOperationException(String message) {
		super(message);
	}

	/**
	 * Cause exception constructor
	 * 
	 * @param cause
	 *            : the exception to re-throw
	 */
	public BankOperationException(Throwable cause) {
		super(cause);
	}

	/**
	 * Message & Cause exception constructor
	 * 
	 * @param message
	 *            : the message already formated for this exception
	 * @param cause
	 *            :the exception to re-throw
	 */
	public BankOperationException(String message, Throwable cause) {
		super(message, cause);
	}
}