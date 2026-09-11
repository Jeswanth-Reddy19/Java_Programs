package exceptionhandling;

	import java.util.Collections;
	import java.util.List;
	import java.util.ArrayList;

	public class UnsupportedOperationExample {

	    public static void main(String[] args) {

	        List<Integer> list = Collections.emptyList();

	        try {
	            list.add(10);
	        }
	        catch (UnsupportedOperationException e) {
	            System.out.println("This operation is not supported.");
	        }
	    }
	}
