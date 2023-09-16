// 14. Diamond pattern
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) {
            // Spaces // 2-1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        // Lower half
        for (int i = n; i >= 1; i--) {
            // Spaces // 2-1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
