// // syntax : 
// return type name(){
//     // body
//  return statement;
// }

/*
public class Function {
    public static void printHelloWord() {
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        printHelloWord(); // function calls
    }
}
 */

// Syntax with Parameters:
// return type name(type Parameters 1, Parameters 2){
//     // body
//     return statement;
// }

import java.util.Scanner;

public class Function {
    // public static void calculateSum() {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = a + b;
    // System.out.println("Sum is : " + sum);
    // }

    // public static void main(String[] args) {
    // calculateSum();
    // }

    // public static void calculateSum(int num1, int num2) {
    // int sum = num1 + num2;
    // System.out.println("Sum is : " + sum);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // calculateSum(a,b);
    // }

    // public static int calculateSum(int num1, int num2) { // input = parameters or
    // formal parameters
    // int sum = num1 + num2;
    // return sum;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int a = sc.nextInt();
    // int b = sc.nextInt();
    // int sum = calculateSum(a, b);// pass = argument or actual parameters
    // System.out.println("Sum is : " + sum);

    // Call by Value
    public static void swap(int a, int b) {
        // swap
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        // swap - Value Exchange
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}
