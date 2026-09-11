package exceptionhandling;
import java.util.Scanner;
public class SIOOBE {
public static void main(String[] args) {
	String name="chinnu";
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the index of the character in the string:");
	int  n=sc.nextInt();
	try {
	System.out.println("the character at te index "+n+" is: "+name.charAt(n));
	}
	catch(StringIndexOutOfBoundsException s) {
		System.out.println("there is no character with the given index in the string");
	}
}
}
