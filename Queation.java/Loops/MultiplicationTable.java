//Question 4 : Write a program to print the multiplication table of a number N, entered by the
// user.

package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void multiplicationTable(int n) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to generate its multiplication table: ");
        int num = sc.nextInt();
        multiplicationTable(num);
    }
}
