package by.zhdanovich.triangle.exception;

public class WrongCoordinateException extends Exception {

	public WrongCoordinateException() {
		super();		
	}
	
	public WrongCoordinateException(String message, Throwable e) {
		super(message, e);		
	}

	public WrongCoordinateException(String message) {
		super(message);		
	}

	public WrongCoordinateException(Throwable e) {
		super(e);		
	}

}
