// 3. print the pattern
// Half pyramid

public class HalfPyramid {
    public static void main(String[] args) {
        int n = 4;
        // outer loop
        // for (int i = 1; i <= n; i++) {
        for (int i = n; i >= 1; i--) { // Inverted Half Pyramid
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");

            }
            System.out.println();

        }

        // outer loop
        // for (int i = 1; i <= n; i++) {
        for (int i = n; i >= 1; i--) { // Inverted Half Pyramid
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");

            }
            System.out.println();

        }

    }
}
