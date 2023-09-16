// Q.2 make a function to multiply 2 numbers and return the product.

import java.util.Scanner;

public class calculateMuliyi {
    public static int printCalculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Product = " + printCalculateProduct(a, b));

    }
}
