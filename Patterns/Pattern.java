public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        // Outer loops
        for (int i = 1; i <= n; i++) {
            // Spaces
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            // numbers -> print row no, row no times
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
