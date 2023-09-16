import java.util.Scanner;

public class TwoDarraydaingolnal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size: ");
        int row = sc.nextInt();
        System.out.println("Enter column size: ");
        int cols = sc.nextInt();

        int[][] number = new int[row][cols];

        // Input
        System.out.println("Enter row and column elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        int leftDiagonalSum = 0;
        for (int i = 0; i < row; i++) {
            leftDiagonalSum += number[i][i];
        }

        int rightDiagonalSum = 0;
        for (int i = 0; i < row; i++) {
            rightDiagonalSum += number[i][cols - 1 - i];
        }

        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of left diagonal: " + leftDiagonalSum);
        System.out.println("Sum of right diagonal: " + rightDiagonalSum);
    }
}
