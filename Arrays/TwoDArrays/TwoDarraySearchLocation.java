
// take a matrix as input from the user. search for a givan number x and 
// print the indices at which it occurs.

import java.util.Scanner;

public class TwoDarraySearchLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Input
        int[][] number = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the number to search for: ");
        int x = sc.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // condition
                if (number[i][j] == x) {
                    System.out.println("Number " + x + " found at location (" + i + ", " + j + ")");

                }
            }
        }

    }
}
