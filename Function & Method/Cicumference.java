// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;

public class Cicumference {
    public static Double getCircumference(Double Radius) {
        return 2 * 3.14 * Radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        Double Radius = sc.nextDouble();
        System.out.println("Radius: " + getCircumference(Radius));
    }
}
