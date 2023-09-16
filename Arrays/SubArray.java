
// contiguous sequence of elements within the original array.
/*
public class SubArray {
    public static void printSubArray(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) { // Print
                    System.out.print(number[k] + " ");
                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarry: " + tp);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printSubArray(number);
    }
}
 */

// contiguous sequence of elements within the original array.

public class SubArray {
    public static void printSubArray(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;// calculate start
            for (int j = 0; j < number.length; j++) {
                int end = j; // calculate end
                for (int k = start; k <= end; k++) { // Print
                    System.out.print(number[k] + " ");// subArray

                }
                tp++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarry: " + tp);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printSubArray(number);
    }
}
