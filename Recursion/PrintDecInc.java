package Recursion;

class PrintDecInc {
    public static void printDec(int n) {
        if (n == 1) { // Base Case
            System.out.println(n); // prints the number 1
            return;
        }
        // recursive case
        System.out.print(n + " ");
        printDec(n - 1);// value of n decreased by 1.
    }

    public static void printInc(int n) {
        if (n == 1) { // Base Case
            System.out.print(n + " "); // prints the number 1
            return;
        }
        // recursive case
        printInc(n - 1);
        System.out.print(n + " ");
        // value of n decreased by 1.
    }

    public static void main(String[] args) {
        int n = 10;
        printDec(n);
        printInc(n);
    }
}
