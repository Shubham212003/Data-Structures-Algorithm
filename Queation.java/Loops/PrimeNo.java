package Loops;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {// n - 1
                if (n % i == 0) { // n is multiple of i (i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("n is Prime");
            } else {
                System.out.println("n is not Prime");
            }
        }
    }
}
