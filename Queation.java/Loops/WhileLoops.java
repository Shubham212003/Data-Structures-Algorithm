package Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        // print hello word.
        // int counter = 0;
        // while (counter < 100) {
        // System.out.println("Hello Word!");
        // counter++;
        // }
        // System.out.println("printed 100x");

        // print number
        // int counter = 1;
        // while (counter <= 10) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();

        // print number form 1 to n.
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;
        // while (counter <= range) {
        // System.out.print(counter + " ");
        // counter++;
        // }
        // System.out.println();

        // print sum of first n natural numbers.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        int i = 1; // 1 2 3 4 5
        while (i <= n) { // 5
            sum += i;// 0 1 3 6 15
            i++;
        }
        System.out.println("Sum is : " + sum);
    }

}
