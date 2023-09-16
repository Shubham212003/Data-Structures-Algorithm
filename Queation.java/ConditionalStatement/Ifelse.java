package ConditionalStatement;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Number = sc.nextInt();
        if (Number % 2 == 0) {
            System.out.println("EVEN : ");
        } else {
            System.out.println("ODD : ");
        }
    }
}
