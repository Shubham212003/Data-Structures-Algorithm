// 8. Floyd's Triangle
public class FloydsTriangle {
    public static void main(String[] args) {
        // logic : jitane row no hai utane hi value print ho rahe hai
        int n = 5;
        int Number = 1;
        // outer loop
        for (int i = 1; i <= n; i++) { // total number of row
            for (int j = 1; j <= i; j++) { // count number of row
                System.out.print(Number + " ");
                Number++;// Number = Number + 1
            }
            System.out.println();
        }

    }

}
