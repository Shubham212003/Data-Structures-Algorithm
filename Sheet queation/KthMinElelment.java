import java.util.*;

public class KthMinElelment {
    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4, 1, 9 };
        int k = 5;
        Arrays.sort(arr);
        System.out.println(arr[k - 1]);

    }
}
