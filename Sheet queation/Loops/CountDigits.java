
//Count the number of digits for a given number n.

package Loops;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numDigits = 0;
        int original_n = n;
        while (n > 0) {
            n = n / 10;
            numDigits++;
        }
        System.out.println("Number of digits in " + original_n + " = " + numDigits);

    }
}
