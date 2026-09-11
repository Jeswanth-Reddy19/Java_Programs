package stringmethods;
import java.util.Scanner;
public class StringCaptial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("the catptalised string:"+name.toUpperCase());
}
}
