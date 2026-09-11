package stringmethods;
import java.util.Scanner;
public class StringCharAt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("enter your name");
	name=sc.next();
	System.out.println("enter the index of the character:");
	int n=sc.nextInt();
	System.out.println("the cahr at the given index is:"+name.charAt(n));
}
}
