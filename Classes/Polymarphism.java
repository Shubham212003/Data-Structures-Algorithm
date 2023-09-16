// package Classes;

// public class Polymarphism {
//     public static void main(String[] args) {
//         Calculator calc = new Calculator();// object
//         System.out.println(calc.sum(1, 2));
//         System.out.println(calc.sum((float) 1.5, (float) 2));// type cast
//         System.out.println(calc.sum(1, 2, 3));
//     }
// }

// class Calculator {
//     // function
//     int sum(int a, int b) {
//         return a + b;
//     }

//     float sum(float a, float b) {
//         return a + b;
//     }

//     int sum(int a, int b, int c) {
//         return a + b + c;
//     }
// }

package Classes;

public class Polymarphism {
    public static void main(String[] args) {
        Dear d = new Dear();
        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class dear extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
