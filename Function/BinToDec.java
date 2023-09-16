// Convert from binary to decimal n = 101.
public class BinToDec {
    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lasDigit = binNum % 10;
            decNum = decNum + (lasDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }
        System.out.println("decimal of " + myNum + " = " + decNum);

    }

    public static void main(String[] args) {
        binToDec(101);

    }
}
