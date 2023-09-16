// 13. Palindromic pattern
public class PalindromicPattern {
    public static void main(String[] args) {
        int n = 5;
        // Outer loops
        for (int i = 1; i <= n; i++) {
            // Spaces // 2-1
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1st half number backword = sapose i = 4 -> 4,3,2,1 .
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // 2nd half number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
