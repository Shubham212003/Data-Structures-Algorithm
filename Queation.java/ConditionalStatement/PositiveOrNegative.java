// Write a Java program to get a number from the user and print whether it is
// positive or negative

package ConditionalStatement;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x > 0) {
            System.out.println("x is greater then 0 ");

        } else {
            System.out.println("x is less then or equal 0");
        }

    }
}
