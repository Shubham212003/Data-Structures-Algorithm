import java.util.*;

public class MaxAndMinSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Array Size");
        int sum = 0;
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Array Elelment:");
        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
            sum = max + min;

        }

        System.out.println("Largest number is : " + max);
        System.out.println("Smallest number is : " + min);
        System.out.println("Sum " + sum);

    }
}
