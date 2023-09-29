
public class TilingProblem {
    public static int tilingProblem(int n) {// 2 x n(floor size)
        // base case
        if (n == 0 || n == 1) {
            return 1;
        }
        // Vertically choice
        int fnm1 = tilingProblem(n - 1);
        // Horizontally choice
        int fnm2 = tilingProblem(n - 2);
        return fnm1 + fnm2;
        // return tilingProblem(n - 1) + (n - 1) * tilingProblem(n - 2);

    }

    public static void main(String[] args) {
        System.out.println("Total Tiling: " + tilingProblem(4));
    }
}
