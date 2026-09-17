package exceptionhandling;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

public class ConcurrentModification{
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        try {
            for (Integer num : numbers) {
                if (num == 20) {
                    numbers.remove(num);
                }
            }
        } 
        catch (ConcurrentModificationException e) {
            System.out.println("Cannot modify the collection while iterating.");
        }
    }
}