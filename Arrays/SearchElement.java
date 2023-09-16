// Q. 1. Take an array as input from the user. search for a given number x and 
// print the index at which it occurs
// Linear Search 

import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size ");
        int size = sc.nextInt();
        int number[] = new int[size];
        // Input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println("Enter Search element ");
        int x = sc.nextInt();
        // Output
        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x found at index : " + i);
            }
        }
    }
}
