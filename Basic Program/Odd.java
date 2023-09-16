import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a natural number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i = i + 2) { // even print i=0;
            System.out.println(i + " ");
        }
    }
}
