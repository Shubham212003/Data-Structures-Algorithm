
// Write a program to print Fibonacci series of n terms where n is input by user:
// 0 1 1 2 3 5 8 13 21..
// in the Fibinacci series , a number is the sum of previous 2 numbers that came before it.
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enetr A Fibonacci Series Number: ");
        // int n = sc.nextInt();
        // int a = 0, b = 1, c;

        // System.out.print(a + " " + b);
        // for (int i = 1; i <= n; i++) {
        // c = a + b;
        // a = b;
        // b = c;
        // System.out.print(" " + c);

        // }

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0, b = 1;

        System.out.print(a + " ");

        if (n > 1) {
            // find nth term
            for (int i = 2; i <= n; i++) {
                System.out.print(b + " ");
                // the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }

            System.out.println();
        }
    }
}
