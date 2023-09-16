
// find the largest and smallest in a given array .
// Time & Space Complexity.O(n)
import java.util.*;

public class Largest {
    public static int getLargest(int number[]) {
        int largest = Integer.MIN_VALUE;// - infinety
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < number.length; i++) {
            // compare all number
            if (largest < number[i]) {
                largest = number[i];
            }
            if (smallest > number[i]) { // greter
                smallest = number[i];
            }
        }
        System.out.println("smallest number is : " + smallest);
        return largest;

    }

    public static void main(String[] args) {
        int number[] = { 9, 2, 4, 6, 1, 3, 5 };
        System.out.println("Largest number is : " + getLargest(number));
    }
}
