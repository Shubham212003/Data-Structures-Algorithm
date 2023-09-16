import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size ");
        int row = sc.nextInt();
        System.out.println("Enter cols size ");
        int cols = sc.nextInt();

        int[][] Number = new int[row][cols];

        // Input
        // row
        System.out.println("Enter row and cols elemnet ");
        for (int i = 0; i < row; i++) {

            // cols
            for (int j = 0; j < cols; j++) {
                Number[i][j] = sc.nextInt();

            }

        }
        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(Number[i][j] + " ");

            }
            System.out.println();
        }

    }
}
