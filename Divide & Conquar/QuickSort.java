public class QuickSort {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si < ei) {
            // Partition the array, and get the pivot index
            int pIdx = partition(arr, si, ei);
            // Recursively sort elements before and after the pivot
            quickSort(arr, si, pIdx - 1); // Left side
            quickSort(arr, pIdx + 1, ei); // Right side
        }
    }

    public static int partition(int arr[], int si, int ei) {
        // Choose the pivot element (usually the last element)
        int pivot = arr[ei];
        int i = si - 1; // Index of smaller element

        for (int j = si; j < ei; j++) {
            // If current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[ei] (pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[ei];
        arr[ei] = temp;

        // Return the index of the pivot element after partition
        return i + 1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 8, 2, 5 };
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        printArr(arr);
    }
}
