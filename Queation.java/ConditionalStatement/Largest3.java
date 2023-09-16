package ConditionalStatement;

import java.util.Scanner;

public class Largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter A First Number ");
        // int a = sc.nextInt();
        // System.out.println("Enter B Second Number ");
        // int b = sc.nextInt();
        // System.out.println("Enter C Third number ");
        // int c = sc.nextInt();
        int a = 4, b = 3, c = 2;
        if (a >= b && a >= c) {
            System.out.println("Largest is A: " + a);

        } else if (b >= c) {
            System.out.println("Largest is B: " + b);
        } else {
            System.out.println("largest is C: " + c);
        }

    }
}
