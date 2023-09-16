public class TrappedReainwter {
    public static int trappedReainwter(int height[]) {
        int n = height.length;
        // calculate the left boundary - Array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // calculate the Right boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }
        int TrappedReainwter = 0;
        // loops
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax , rightmax)
            int waterlevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped water = water level - height[i]
            TrappedReainwter += waterlevel - height[i];
        }
        return TrappedReainwter;

    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedReainwter(height));

    }
}
