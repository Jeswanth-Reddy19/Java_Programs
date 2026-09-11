package stringmethods;
import java.util.Scanner;
public class StringContains {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name,name1;
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("enter the part you wanna check:");
	name1=sc.next();
	if(name.contains(name1)) {
		System.out.println("the string contains the given part");
	}
	else {
		System.out.println("the element does not contains the given part");
	}
}
}
