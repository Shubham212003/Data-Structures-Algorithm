
// 1.	Make a function to check if a number is prime or not.

import java.util.*;

public class Prime {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        /// System.out.println("Enter A number : ");
        // int n = sc.nextInt();
        for (int n = 1; n <= 100; n++) {
            int temp = 0;
            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    temp = temp + 1;
                }
            }

            if (temp == 0) {
                System.out.println(n);
            }
        }
        System.out.println();
    }

}
