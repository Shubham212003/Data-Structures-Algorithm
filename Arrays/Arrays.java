//
// 1.Take an array of names as input from the user and print them on the screen.

import java.util.*;

public class Arrays {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        System.out.println("Enetr A name: ");
        // input
        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // output
        for (int i = 0; i < names.length; i++) {
            System.out.println("name " + (i + 1) + " is : " + names[i]);
        }

    }

    public static void sort(int[] arr) {
    }

    public static char[] toString(int[] arr) {
        return null;
    }
}
