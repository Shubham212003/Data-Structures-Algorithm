
// 1.	Make a function to check if a number is prime or not.
import java.util.*;
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        /// System.out.println("Enter A number : ");
        // int n = sc.nextInt();
        int n = 9;
        int temp = 0;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("Number is Prime: ");
        } else {
            System.out.println("Number is not prime");
        }
    }

}
