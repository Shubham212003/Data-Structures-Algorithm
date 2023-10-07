import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the length of the rectangle
        System.out.println("Enter A Length ");
        int Length = sc.nextInt();

        // Prompt the user to enter the breadth of the rectangle
        System.out.println("Enter A Breadth");
        int Breadth = sc.nextInt();

        // Calculate the area and perimeter of the rectangle
        int Area = Length * Breadth;
        int Perimeter = 2 * (Length + Breadth);

        // Compare the area and perimeter and print the appropriate message
        if (Area > Perimeter) {
            System.out.println("Area is greater than perimeter ");

        } else if (Perimeter > Area) {
            System.out.println("Perimeter is greater than Area ");

        } else {
            System.out.println("Area and Perimeter are Equal ");
        }

        // Close the Scanner to prevent resource leak
        sc.close();
    }
}
