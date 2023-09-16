// Q.1 make a function to add 2 numbers and return the sum.

import java.util.Scanner;

public class calculateSum {
    public static int printCalculateSum(int a, int b) {
        int Sum = a + b;
        return Sum;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Sum = printCalculateSum(a, b);
        System.out.println("Sum = " + Sum);

    }
}
