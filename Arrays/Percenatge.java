import java.util.*;

public class Percenatge {
    public static void main(String[] args) {
        int Marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Marks");
        Marks[0] = sc.nextInt();// phy
        Marks[1] = sc.nextInt();// che
        Marks[2] = sc.nextInt();// math

        System.out.println("Phy : " + Marks[0]);
        System.out.println("che : " + Marks[1]);
        System.out.println("math : " + Marks[2]);

        int Percentage = (Marks[0] + Marks[1] + Marks[2]) / 3;
        System.out.println("Percentage = " + Percentage + "%");
        // find aaray length
        //
        System.out.println("Array of length : " + Marks.length);

    }
}
