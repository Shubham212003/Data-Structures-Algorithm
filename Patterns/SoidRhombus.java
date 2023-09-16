// 11. Soid Rhombus
public class SoidRhombus {
    public static void main(String[] args) {
        int n = 5;
        // Outer loops
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
