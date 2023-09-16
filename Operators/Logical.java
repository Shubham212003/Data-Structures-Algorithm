package Operators;

// use cakes whether and expression is true or false. 
public class Logical {
    public static void main(String[] args) {
        // && (Logical And) T -> T = T other wise False
        System.out.println("Logical And Operator");
        System.out.println((3 > 2) && (5 > 0));// true
        System.out.println((3 < 2) && (5 > 0));// false
        System.out.println((3 > 2) && (5 < 0));// false
        System.out.println((3 < 2) && (5 < 0));// false
        System.out.println("Logical Or Operator");
        // || (Logical Or) F other wise false
        System.out.println((3 < 2) || (5 < 0));// false
        System.out.println((3 > 2) || (5 < 0));// true
        System.out.println((3 < 2) || (5 > 0));// true
        System.out.println((3 > 2) || (5 > 0));// true
        // ! (Logical Not) T -> F , F -> T
        System.out.println("Logical Not Operator");
        System.out.println(!(3 == 2));// true
        System.out.println(!(3 == 3));// false

    }
}
