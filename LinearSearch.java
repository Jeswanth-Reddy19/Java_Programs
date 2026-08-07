package codejava;
import java.util.*;
public class LinearSearch {
public static void main(String[] args ){
	System.out.println("enter the no of elements of the array:");
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	int[]  arr=new int[n];
	System.out.println("enter the emlements of the array :");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("enter the elemlemnt to search in the array");
	int x=sc.nextInt();
	boolean flag=false;
	for(int i=0;i<n;i++) {
		if(arr[i]==x) {
			System.out.println("the element is found at the position of:"+i);
			flag=true;
		break;
		}
}
	if(!flag) {
		System.out.println("the element is not found in the array");
	}
	sc.close();
}
}
