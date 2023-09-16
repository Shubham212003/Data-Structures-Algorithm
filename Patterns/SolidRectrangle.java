
// 1 print the Pattern
// Solid Rectrngle
public class SolidRectrangle {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;
        for (int i = 1; i < n; i++) { // n = row
            for (int j = 1; j < m; j++) { // j = col
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) { // n = row
            for (int j = 1; j < m; j++) { // j = col
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) { // n = row
            for (int j = 1; j < m; j++) { // j = col
                System.out.print(i + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) { // n = row
            char ch = 'A';
            for (int j = 1; j < m; j++) { // j = col
                System.out.print(ch + " ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
    }
}
