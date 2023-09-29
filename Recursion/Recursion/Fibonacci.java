package Recursion;

public class Fibonacci {
    public static int Fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = Fibonacci(n - 1);
        int fnm2 = Fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println(Fibonacci(n));
    }
}
