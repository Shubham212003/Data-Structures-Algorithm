import java.util.Scanner;

public class SideOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A First Number ");
        int a = sc.nextInt();
        System.out.println("Enter A Second Number ");
        int b = sc.nextInt();
        System.out.println("Enter A Third number  ");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}