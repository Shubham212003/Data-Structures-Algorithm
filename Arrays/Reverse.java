/*
import java.util.Scanner;

public class Reverce {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element in array ");
        // Input
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        // Output
        System.out.println("Array element ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("array reverce element ");
        for (int i = 5 - 1; i >= 0; i--) {
            System.out.println(a[i] + " ");
         }
    }
}
 */

//  // import java.util.*;

// // public class Reverse {
// //     public static void reverse(int arr[]) {
// //         int n = arr.length;
// //         for (int i = 0; i < n / 2; i++) {
// //             int temp = arr[i];
// //             arr[i] = arr[n - 1 - i]; // 0 - 4  , 1 - 3 
// //             arr[n - 1 - i] = temp;
// //         }
// //     }

// //     public static void main(String[] args) {
// //         int arr[] = { 1, 2, 3, 4, 5, 6 };
// //         reverse(arr);
// //         System.out.println(Arrays.toString(arr));
// //     }
// // }

// import java.util.*;

// public class Reverse {
//     public static void reverse(int arr[], int start, int end) {
//         if (start > end)
//             return;
//         int temp = arr[start];
//         arr[start] = arr[end];
//         arr[end] = temp;

//         // Recursive function call
//         reverse(arr, start + 1, end - 1);
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 4, 5, 6 };
//         reverse(arr, 0, arr.length - 1);
//         System.out.println(Arrays.toString(arr));
//     }
// }

// Reverse  Array
// Time & Space Complexity
// time O(n) and Space O(1).
public class Reverse {
    public static void reverse(int number[]) {
        int first = 0, Last = number.length - 1; // These variables represent the first and last indices of the array.
        while (first < Last) {
            // swap
            int temp = number[Last];
            number[Last] = number[first];
            number[first] = temp;
            first++;
            Last--;
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 7, 8 };
        reverse(number);

        // print
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
        System.out.println();
    }
}
