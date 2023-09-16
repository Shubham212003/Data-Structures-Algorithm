public class MinAndMix {
    public static void findMinAndMix(int arr[]) {
        if (arr == null || arr.length == 0)
            return;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
            // if (arr[i] < min) {
            // min = arr[i];
            // }
            // if (arr[i] > max) {
            // max = arr[i];
            // }
        }
        System.out.println("maximum: " + max);
        System.out.println("minimum: " + min);

    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 3, 4, 1, 9 };
        findMinAndMix(arr);

    }
}
