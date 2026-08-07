package codejava;
import java.util.*;
public class ArrayOpp {
public static void main(String[] args){

	Scanner sc=new Scanner(System.in); 
	System.out.println("enter the no  of elements to be put in  the array");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("enter the elements of the array  in the orrder");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	int max=arr[0],min=arr[0];
	float sum=0f;
	for(int i=0;i<n;i++) {
		sum+=arr[i];
	}
	System.out.println("the sum of all elements of  th array is:"+sum);
	System.out.println("the average of tha elments in the array is: "+(sum/n));
	for(int i=0;i<n;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
	}
		for(int y=0;y<n;y++) {
			if(arr[y]<min) {
				min=arr[y];
			}
		}
		System.out.println("the  max value of array is:"+max);
		System.out.println("the min value of the array  is:"+min);
	}
}
