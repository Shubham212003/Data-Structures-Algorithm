/*
// Function Overloading 
// using no of parameters 
public class FunctionOverloading {
    // fun calculate a sum of 2 no
    public static int sum(int a, int b) {
        return a + b;
    }

    // fun calculate a sum of 3 no
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 3));
        System.out.println(sum(5, 2, 1));
    }
}
 */

// using data type 
public class FunctionOverloading {
    // fun cal int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // fun to cal float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sum(5, 3));
        System.out.println(sum(3.2f, 4.8f));

    }
}
