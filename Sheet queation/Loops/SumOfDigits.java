// Find the sum of digits in a given number n.
package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int SumOfDigits = 0;
        int original_n = n;
        while (n > 0) {
            SumOfDigits += n % 10;
            n = n / 10;

        }
        System.out.println("Number of digits in " + original_n + " = " + SumOfDigits);
    }
}
