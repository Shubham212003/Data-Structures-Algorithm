// package Classes;

// public class Abstract {
//     public static void main(String[] args) {
//         Horse h = new Horse();
//         h.eats();
//         h.walk();

//         Chicken c = new Chicken();
//         c.eats();
//         c.walk();
//     }
// }

// // abstract class
// abstract class Animal {
//     // non-abstract method
//     void eats() {
//         System.out.println("animal eats"); // Default implementation
//     }

//     // abstract method
//     abstract void walk(); // no implementation
// }

// // sub class
// class Horse extends Animal {
//     void walk() {
//         System.out.println("walks on 4 legs");
//     }
// }

// class Chicken extends Animal {
//     void walk() {
//         System.out.println("walks on 2 legs");
//     }
// }

package Classes;

public class Abstract {
    public static void main(String[] args) {
        Mustang myHorse = new Mustang();
        // Animal -> Horse -> Mustang
    }
}

// abstract class
abstract class Animal {
    Animal() {
        System.out.println("animal constructor called..");
    }

    // non-abstract method
    void eats() {
        System.out.println("animal eats"); // Default implementation
    }

    // abstract method
    abstract void walk(); // no implementation
}

// sub class
class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called..");
    }

    void walk() {
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called..");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("walks on 2 legs");
    }
}
