package Loops;

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {
        // if (i == 3) {
        // break;
        // }
        // System.out.println(i);
        // }
        // System.out.println("i am out of the loop");

        // Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter a number ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("i am out of the loop");
                break;
            }
            System.out.println(n);
        } while (true);

    }
}
