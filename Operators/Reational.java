package Operators;

// use for comparison
public class Reational {
    public static void main(String[] args) {
        // == is equal to
        int a = 10;
        int b = 5;
        System.out.println((a == b));// false
        System.out.println((b == a));// false
        // != is not equal to
        System.out.println(a != b);// true
        System.out.println((b != a));// true
        // > Greater than
        System.out.println((a > b));// true
        System.out.println(b > a); // true
        // < less than
        System.out.println((a < b));// false
        System.out.println((b < b));// false
        // >= Greater than or equal to
        System.out.println((a >= b));// true
        System.out.println((b >= a));// false
        // <= less than or equal to
        System.out.println((a <= b));// false
        System.out.println((b <= a));// true
    }
}
