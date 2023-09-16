
// contiguous sequence of elements within the original array.

public class maxSubArraySum {
    public static void MAXSubArraySum(int number[]) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                CurrSum = 0;
                for (int k = start; k <= end; k++) { // Print
                    CurrSum += number[k];

                }
                System.out.println(CurrSum);
                if (maxSum < CurrSum) {
                    maxSum = CurrSum;

                }

            }
        }
        System.out.println("Max Sum = " + maxSum);

    }

    public static void main(String[] args) {
        // int number[] = { 2, 4, 6, 8, 10 };
        int number[] = { 1, -2, 6, -1, 3 };
        MAXSubArraySum(number);
    }
}
