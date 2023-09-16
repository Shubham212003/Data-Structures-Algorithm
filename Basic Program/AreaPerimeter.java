import java.util.Scanner;

public class AreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Length ");
        int Length = sc.nextInt();
        System.out.println("Enter A Breadth");
        int Breadth = sc.nextInt();
        int Area = Length * Breadth;
        int Perimeter = 2 * (Length + Breadth);
        if (Area > Perimeter) {
            System.out.println("Area is greater then perimeter ");

        } else if (Perimeter > Area) {
            System.out.println("Perimeter is greater than Area ");

        } else {
            System.out.println("Area and Perimeter is Equal ");
        }
    }

}