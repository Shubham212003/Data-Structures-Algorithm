
// The Decision Control Structure 
// simple if statement 
// if..else statement 
// Nested if...else statement 
// else...if ladder

/*  simple if statement
public class DCS {
    public static void main(String[] args) {
        int x = 12;
        if (x < 20) {
            System.out.println("Number is less than 20");
        }

    }

}
*/

/*  if..else statement 

import java.util.Scanner;

public class DCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number;
        System.out.println("Enter The Number = ");

        Number = sc.nextInt();

        if (Number % 2 == 0) {
            System.out.println("Even Number " + Number);
        } else {
            System.out.println("Odd " + Number);
        }
    }

}
*/

// Nested if...else statement 
import java.util.Scanner;

// public class DCS {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter three numbers:");

//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();

//         if (a > b) {
//             if (a > c) {
//                 System.out.println("Largest number is " + a);
//             } else {
//                 System.out.println("Largest Number is " + c);
//             }
//         } else {
//             if (b > c) {
//                 System.out.println("Largest Number is " + b);
//             } else {
//                 System.out.println("Largest Number is " + c);
//             }
//         }
//     }
// }

// else...if ladder

import java.util.Scanner;

public class DCS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number = ");
        int Number = sc.nextInt();
        if (Number > 0) {
            System.out.println("Number is Positive " + Number);

        } else if (Number < 0) {
            System.out.println("Number is Negative " + Number);
        } else {
            System.out.println("Number is Zero " + Number);
        }
    }
}