package codejava;
import java.util.*;

public class MyProgram {
public static void main(String[] args) {
	System.out.println("enter the number of elements tobe put in the array");
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] arr = new int [n];
	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt(); 
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
}
}
