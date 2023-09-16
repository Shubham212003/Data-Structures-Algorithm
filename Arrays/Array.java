
// Defining an Array
// datatype[] ArrayName = new datatype[size];

// import java.util.*;

// public class Array {
//     public static void main(String[] args) {
//         int[] marks = new int[3];
//         // int marks[] = new int[3];
//         marks[0] = 96;
//         marks[1] = 56;
//         marks[2] = 78;
//         // System.out.println(marks[0]);
//         // System.out.println(marks[1]);
//         // System.out.println(marks[2]);
//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//         }
//     }

// }

// // defining second

// public class Array {
//     public static void main(String[] args) {
//         int marks[] = { 89, 34, 67 };
//         for (int i = 0; i < 3; i++) {
//             System.out.println(marks[i]);
//         }
//     }
// }

// import java.util.Scanner;

// public class Array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int number[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             System.out.println(number[i]);
//         }
//     }
// }

public class Array {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String[] args) {
        int marks[] = { 87, 88, 89 };
        update(marks);
        // print
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();

    }
}
// import java.util.Scanner;

// public class Array {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int size = sc.nextInt();
// int number[] = new int[size];

// // Input

// for (int i = 0; i < size; i++) {
// number[i] = sc.nextInt();
// }

// // Output
// for (int i = 0; i < size; i++) {
// System.out.println(number[i]);
// }
// }
// }
