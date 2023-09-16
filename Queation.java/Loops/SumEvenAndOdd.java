package Loops;

import java.util.Scanner;

public class SumEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number;
        int Choise;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter a number");
            Number = sc.nextInt();
            if (Number % 2 == 0) {
                evenSum += Number;
            } else {
                oddSum += Number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            Choise = sc.nextInt();

        } while (Choise == 1);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);

    }

}
