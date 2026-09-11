package exceptionhandling;

	public class IllegalThreadExceptionExample {

	    public static void main(String[] args) {

	        Thread t = new Thread();

	        try {
	            t.start();
	            t.start();   // Trying to start the same thread again
	        }
	        catch (IllegalThreadStateException e) {
	            System.out.println("The thread cannot be started again.");
	        }
	    }
	}
