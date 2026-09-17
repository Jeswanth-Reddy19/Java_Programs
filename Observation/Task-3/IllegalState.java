package exceptionhandling;
import java.util.Scanner;
public class IllegalState {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n,x;
		System.out.print("enter the vaalue of n:");
		n=sc.nextInt();
		System.out.println("the value of n is:"+n);
		sc.close();
		System.out.print("enter the value of x:");
		try {
		x=sc.nextInt();
		System.out.println("the value of x is:"+x);
		}
		catch(IllegalStateException is) {
			System.out.println("the Scanner class is not in appropriate state to do  the operation");
		}
	}

}
