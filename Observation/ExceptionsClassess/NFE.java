package exceptionhandling;
import java.util.Scanner;
public class NFE {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the age:");
	String age=sc.next();
	try {
	int x=Integer.parseInt(age);
	System.out.println("the age is:"+x);
	}
	catch(NumberFormatException n){
		System.out.println("the input string invalid  to convert to integer type");
	}
}
}
