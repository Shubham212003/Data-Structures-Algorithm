// check if a number is prime or not 

/*

public class CheckisPrime {
    public static boolean isPrime(int n) {
        // boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) { // Completely dividing
                // isPrime = false;
                // break;
                return false;
            }
        }
        // return isPrime;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));

    }
}
 */

// Optimize Solution
public class CheckisPrime {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {

                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(7));
    }
}
