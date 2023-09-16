
// 8. Two numbers are entered by the user, x and n. Write a function to 
// find the value of one number raised to the power of another i.e. x^n.

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The X Number ");
        int x = sc.nextInt();
        System.out.println("Enter a N Number ");
        int n = sc.nextInt();

        int result = 0;
        for (int i = 0; i < n; i++) {
            result = result * x;
        }
        System.out.println("x to the power n is : " + result);

    }
}
