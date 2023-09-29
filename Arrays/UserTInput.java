import java.util.*;

public class UserTInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        // Input
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        // Output
        for (int i = 0; i < size; i++) {
            System.out.println("Number: " + number[i]);
        }
    }
}