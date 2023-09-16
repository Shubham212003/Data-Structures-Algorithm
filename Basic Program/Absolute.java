// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.

import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if (n < 0) { // if n is less than zero
            n = n * (-1); // -5 = - 5 * (-1) = 5
        }
        System.out.println("The Value is Absolute: " + n);
    }
}
