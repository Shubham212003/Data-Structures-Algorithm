package Loops;
// For Loop

// for(initialization; condition; increment/decrement)
// {    
// statement or code to be executed    
// }

/* 
public class Loops {
    public static void main(String[] args) {
        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Hello Word ");

        }
    }
}
*/

// public class Loops {
//     public static void main(String[] args) {
//         int counter = 0;
//         while (counter <= 10) {
//             System.out.println(counter);
//             counter++;

//         }
//     }

// }

// public class Loops {
// public static void main(String[] args) {
// int counter = 0;
// do {
// System.out.println(counter);
// counter++;
// } while (counter < 100);
// }
// }

// print the sum of the stream of integer in the input.

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int sum = 0;
        while (counter != -1) {
            sum += counter;
            counter = sc.nextInt();
        }
        System.out.println(sum);
    }

}
