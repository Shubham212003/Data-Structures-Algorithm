// 7. print the pattern
// .Inverted Half pyramid with numbrs
public class InvertedHalfpyramidwithNumbrs {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}