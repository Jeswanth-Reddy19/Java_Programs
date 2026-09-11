package stringmethods;
import java.util.Scanner;
public class StringLowerCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("the lowercase string:"+name.toLowerCase());
}
}
