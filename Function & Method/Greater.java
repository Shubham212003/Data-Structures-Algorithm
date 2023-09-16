// write a functionwhich takes in 2 numbers and returns the greater of those two.

import java.util.Scanner;

public class Greater {
    public static int getGreater(int a, int b) {
        // condition
        if (a > b) {
            return a;

        } else {
            return b;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater Number:" + getGreater(a, b));

    }
}
