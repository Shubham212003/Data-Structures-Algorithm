package Loops;

public class ForLoops {
    public static void main(String[] args) {
        // print hello word..
        // for (int i = 1; i <= 10; i++) {// i=i+1
        // System.out.println("Hello Word!");
        // }

        // print Square pattern.
        // for (int line = 1; line <= 4; line++) {
        // System.out.println("*****");
        // }

        // print Reverse of a number.
        // int n = 10899;

        // while (n > 0) {
        // int lastDigit = n % 10; // 9 9 8 0 1
        // System.out.print(lastDigit + " ");
        // n = n / 10;// 1089 108 10 1 0

        // }

        // reverse the given numbers.
        int n = 10899;
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
