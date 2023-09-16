import java.util.Arrays;

public class ShortArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 7 };

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array:");
        for (int num : arr) { // After the declaration, a colon (:) is used to separate the loop variable from
                              // the array (arr in this case) being iterated
            System.out.println(num);
        }
    }
}
