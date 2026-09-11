package exceptionhandling;
class Nice{
	void think(){
		System.out.println("hello everyone");
		}
}

public class NPE {
public static void main(String[] args) {
	
	try{
		Nice n=null;
	    n.think();
}
catch(NullPointerException np) {
	System.out.println("the desired variable points to null");
}
}
}
