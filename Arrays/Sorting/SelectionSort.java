package Sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) { // turn count
            int minPos = i;// minPostion = current position
            for (int j = i + 1; j < arr.length; j++) {// unsorted arry se dhundke minmum nikala
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // swap //minPos ko minPos kye sath swap kardhya
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    // print
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        selectionSort(arr);
        printArr(arr);

    }
}
