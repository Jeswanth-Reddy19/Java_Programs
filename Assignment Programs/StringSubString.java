package stringmethods;
import java.util.Scanner;
public class StringSubString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("the substring is:"+name.substring(1,3));
}
}
