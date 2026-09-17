package exceptionhandling;
import java.util.Scanner;
public class AIOOBE {
public static void main(String[] args) {
	int arr[]=new int[]{1,2,3,4,5};
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the index of the element:");
	int n=sc.nextInt();
	try{
		System.out.println("element with index 6 is:"+arr[n]);
	}
	catch(ArrayIndexOutOfBoundsException a){
		System.out.println("the  index is not in the range of the array");
	}
}
}
