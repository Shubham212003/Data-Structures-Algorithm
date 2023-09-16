import java.util.Arrays;

public class MoveNegativeOrPositive {
    public static void findMoveNegativeOrPositive(int arr[]) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] < 0)
                left++;// left +ve
            while (arr[right] > 0)
                right--; // right -ve

            if (left >= right)
                break;
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

        }

    }

    public static void main(String[] args) {
        int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9, -6, 3 };
        findMoveNegativeOrPositive(arr);
        System.out.println(Arrays.toString(arr));

    }

}
