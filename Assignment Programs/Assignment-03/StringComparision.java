package stringmethods;
import java.util.Scanner;
public class StringComparision {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name1,name2;
	System.out.println("enter your first name");
	name1=sc.next();
	System.out.println("enter your second name");
	name2=sc.next();
	if(name1.equals("name2")) {
	System.out.println("the strigs are same");
	}
	else {
		System.out.println("the two strings are not same");
	}
}
}
