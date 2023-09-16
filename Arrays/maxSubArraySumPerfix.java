
// contiguous sequence of elements within the original array.
// O(n2) < O(n3)
public class maxSubArraySumPerfix {
    public static void printMAXSubArray(int number[]) {
        int CurrSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];
        prefix[0] = number[0];
        // Calculate prefic array

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];// pahile wale sare element ka sum + current elemnet ka sum

        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = 0; j < number.length; j++) {
                int end = j;
                // CurrSum =0;
                // prefix sum clalculate
                CurrSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                // for (int k = start; k <= end; k++) { // Print
                // CurrSum += number[k];

                // }
                // System.out.println(CurrSum);
                if (maxSum < CurrSum) {
                    maxSum = CurrSum;

                }

            }
        }
        System.out.println("Max Sum = " + maxSum);

    }
    // O(n)

    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < number.length; i++) {
            cs = cs + number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Our max subarray sum is : " + ms);

    }

    public static void main(String[] args) {
        // int number[] = { 1, -2, 6, -1, 3 };// 6,-1,3
        int number[] = { -2, -3, 4, -1, -2, 1, 5 };

        // printMAXSubArray(number);
        kadanes(number);
    }
}
