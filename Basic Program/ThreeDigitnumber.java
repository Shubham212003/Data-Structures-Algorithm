import java.util.Scanner;

public class ThreeDigitnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int number = sc.nextInt();
        if (number > 99 && number < 1000) {
            System.out.println("This is three digit number : " + number);

        } else {
            System.out.println("this is not a three digit number : ");
        }
    }

}