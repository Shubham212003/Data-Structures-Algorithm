import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, Number;
        for (i = 0; i < 10; i++) {
            System.out.println("Enter any NUmber : ");
            Number = sc.nextInt();
            if (Number <= 0) {
                System.out.println("Zero or negative value found ");
                break;
            }
            System.out.println("Your Number is = " + Number);
        }
    }
}

// print the first multiple of 5 which is also a multiple of 7.

// public class BreakStatement {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int num = 1;
// while (true) {
// if ((num % 5 == 0) && (num % 7 == 0)) {
// System.out.println("Found ans = " + num);
// break;
// }
// num++;
// }
// }
// }
