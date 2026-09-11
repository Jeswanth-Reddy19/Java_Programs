package stringmethods;
import java.util.Scanner;
public class StringLength {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name;
	System.out.println("enter your name");
	name=sc.next();
	int n=name.length();
	System.out.println("thr length of the string is:"+n);
}
}
