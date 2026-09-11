package stringmethods;
import java.util.Scanner;
public class StringConacat {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String name1,name2;
	System.out.println("enter your first name");
	name1=sc.next();
	System.out.println("enter your second name");
	name2=sc.next();
	System.out.println("the concatenated string is:"+name1.concat(name2));
}
}
