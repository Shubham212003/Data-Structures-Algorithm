
// 2.	Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;

public class SumOfOddNo {
    public static void printSum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);

    }
}
