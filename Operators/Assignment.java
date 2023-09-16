package Operators;

public class Assignment {
    public static void main(String[] args) {
        int A = 10;
        // A = A + 10;// 20
        A += 10;// 20
        A -= 10;// 0
        System.out.println(A);
        int B = 5;
        // B = B - 5;
        B -= 5;
        System.out.println(B);
        int C = 5;
        // C = C - 15
        C *= 5;
        System.out.println(C);
        int D = 5;
        // D = D / 5;
        D /= 5;
        System.out.println(D);
        int R = 5;
        R %= 5;
        System.out.println(R);

    }
}
