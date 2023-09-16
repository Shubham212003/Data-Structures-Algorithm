import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] num = { 1, 2, 3, 4, 5 };
        int k = 2;

        int n = num.length;
        k = k % n;
        ReverseArray(num, 0, n - 1);
        ReverseArray(num, 0, k - 1);
        ReverseArray(num, k, n - 1);

        // Print the rotated array using Arrays.toString()
        System.out.println(Arrays.toString(num));
    }

    static void ReverseArray(int[] num, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;
        }
    }
}
