package codejava;

import java.util.Scanner;

public class BubblesSort {
public static void main(String[] args) {
	System.out.println("enter the no of elements of the array:");
	Scanner sc= new Scanner(System.in);
	int n =sc.nextInt();
	int[]  arr=new int[n];
	System.out.println("enter the emlements of the array :");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++) {
		for(int j=0;j<n-1-i;j++) {
			if(arr[j]<arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	 
}
}
