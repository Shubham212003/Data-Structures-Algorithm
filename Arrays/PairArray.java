public class PairArray {
    // tp = n(n-1)
    // ---------
    // 2
    public static void printpair(int number[]) {
        int tp = 0;
        for (int i = 0; i < number.length; i++) {
            int curr = number[i]; // 2,4,6,8,10
            for (int j = i + 1; j < number.length; j++) { // 4,6,8,10
                System.out.print("(" + curr + "," + number[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total Pairs:" + tp);

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        printpair(number);

    }
}