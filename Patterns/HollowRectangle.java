// 2. print the pattern
// Hollow Rectangle

// Boundri track

public class HollowRectangle {
    public static void main(String[] args) {
        int n = 4;
        int m = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("* ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

        // outer loop
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            // inner loop
            for (int j = 1; j <= m; j++) {
                // cell -> (i,j)
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print(ch + " ");
                    ch = (char) (ch + 1);
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();

        }

    }
}
