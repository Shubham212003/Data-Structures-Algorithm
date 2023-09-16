import java.util.Scanner;

public class EvanOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A number= ");
        int Number = sc.nextInt();
        // logic
        if (Number % 2 == 0)
            System.out.println(Number + " is even");
        else
            System.out.println(Number + " is odd");

    }

}
