
public class FindProduct {
    public static int printCalculateProduct(int a, int b) {
        int Product = a * b;
        return Product;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int prod = printCalculateProduct(a, b);
        System.out.println("a * b " + prod);

    }
}
