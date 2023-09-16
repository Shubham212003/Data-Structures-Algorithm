package Recursion;

public class SumNNo {
    public static int calcSum(int n) {
        // Base Case
        if (n <= 1) {
            return 1;
        }
        // recursive case
        return n + calcSum(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(calcSum(n));

    }
}
