public class DecToBin {
    public static void decToBin(int n) {
        int myNum = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int rem = n % 2;// rem meas last digit
            binNum = binNum + (rem * (int) Math.pow(10, pow));// binary no
            pow++;
            n = n / 2; // quation
        }
        System.out.println("binary from of " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        decToBin(5);

    }
}
