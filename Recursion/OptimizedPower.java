
public class OptimizedPower {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfpower = optimizedPower(a, n / 2);
        int halfpowerSq = halfpower * halfpower;
        // n = Odd
        if (n % 2 != 0) {
            halfpowerSq = a * halfpowerSq;
        }
        return halfpowerSq;
    }

    public static void main(String[] args) {

        System.out.println(optimizedPower(2, 10));
    }
}
