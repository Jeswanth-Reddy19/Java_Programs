package stringmethods;
import java.util.Scanner;
public class StringIndex {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("enter your name");
	name=sc.next();
    System.out.println("the character of the index is:"+name.indexOf(2));
	
}
}
