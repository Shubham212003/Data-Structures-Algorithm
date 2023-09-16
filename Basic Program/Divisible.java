import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number");
        int n = sc.nextInt();
        if (n % 5 == 0 && n % 3 == 0) { // second question is || operator use
            System.out.println("The Number is divisible by 5 and 3");
        } else {
            System.out.println("it is not divisible by number");
        }

    }

}
