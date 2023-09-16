// write a function the takes in age as input and return if that person
// is eligible to vote or not . A person of age>18 is eligible to vote. 

import java.util.Scanner;

public class eligibleVote {
    public static boolean isEligibal(int age) {
        if (age > 18) {
            System.out.println("eligible for Vote: ");
            return true;

        } else {
            System.out.println("eligible for Not Vote:");
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A age:");
        int age = sc.nextInt();
        System.out.println(isEligibal(age));

    }
}
