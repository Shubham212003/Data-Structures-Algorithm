// Given 2 numbers a and b.Find a raise to the power b.
package Loops;

import java.util.Scanner;

public class FindPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }
        System.out.println(ans);
    }
}
