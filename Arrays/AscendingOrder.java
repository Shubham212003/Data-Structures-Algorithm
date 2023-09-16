
//3.	Take an array of numbers as input and check if it is an array sorted in ascending order.
//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//     {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;

public class AscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // Input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        boolean isAscending = true;// A boolean variable isAscending is initialized as true. This variable
                                   // will be used to track whether the array is sorted in ascending order.

        for (int i = 0; i < numbers.length - 1; i++) { // NOTICE numbers.length - 1 as termination condition
            if (numbers[i] > numbers[i + 1]) { // This is the condition for descending order
                isAscending = false;
            }
        }

        if (isAscending) {
            System.out.println("The array is sorted in ascending order");
        } else {
            System.out.println("The array is not sorted in ascending order");
        }

    }
}
