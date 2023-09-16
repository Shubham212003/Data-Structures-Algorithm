import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Positive Integer:");
        int number = sc.nextInt();// to hold number
        int factorial = 1;// to hold a factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;// factorial = factorial * i
            System.out.println("The factorial of " + number + " is: " + factorial);

        }
    }
}
