package util;

public class ApplicationException extends Exception {

	
	private static final long serialVersionUID = 1L;

	public ApplicationException(){
		System.out.println("Empty exception");
	}
	
	public ApplicationException(String message){
		System.out.println(message);
	}
	
	public ApplicationException(String message, Throwable cause){
		 System.out.println(message);
		 System.out.println(cause);		
	}
}