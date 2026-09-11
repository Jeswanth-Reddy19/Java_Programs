package exceptionhandling;
import java.util.Scanner;
public class IAE {
    public static void setAge(int age) {

        try{if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        System.out.println("Age is: " + age);
        }
        catch(IllegalArgumentException ia) {
        	System.out.println("the entered age is invalid");
        }
    }

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("enter the age:");
int n=sc.nextInt();
        setAge(n);
    }
}
