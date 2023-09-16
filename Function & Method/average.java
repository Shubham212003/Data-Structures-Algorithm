// 1.Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a three number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a + b + c) / 3;
        System.out.println("average of three numbers= " + average);
    }
}
