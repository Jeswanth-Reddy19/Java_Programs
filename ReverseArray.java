package codejava;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args ){
		System.out.println("enter the no of elements of the array:");
		Scanner sc= new Scanner(System.in);
		int n =sc.nextInt();
		int[]  arr=new int[n];
		System.out.println("enter the emlements of the array :");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
        System.out.println("the elements before the reversing is:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		int temp; 
		for(int i=0;i<n/2;i++) {
			temp=arr[i];
			arr[i]=arr[n-1-i];
			arr[n-1-i]=temp;
		}
		System.out.println("the elements after the reversing is:");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
