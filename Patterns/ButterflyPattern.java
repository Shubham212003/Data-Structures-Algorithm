// 10. Butterfly pattern

public class ButterflyPattern {
    public static void main(String[] args) {
        int n = 5;
        // upper half
        for (int i = 1; i <= n; i++) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int Spaces = 2 * (n - i);
            for (int j = 1; j <= Spaces; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            // first part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int Spaces = 2 * (n - i);
            for (int j = 1; j <= Spaces; j++) {
                System.out.print(" ");
            }
            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
