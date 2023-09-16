package Classes.Inharitance;

import Classes.Dog;

public class Inheritance {

    // public static void main(String[] args) {
    // Fish shark = new Fish();// Fish object
    // shark.eat();
    // }
    // }

    // // base class
    // class Animal {
    // String color;// properties

    // void eat() {
    // System.out.println("eats");
    // }

    // void breathe() {
    // System.out.println("Breathes");
    // }

    // }

    // // Derived class/ Sub Class
    // class Fish extends Animal {// extends-khichann
    // int fins; // properties

    // void swim() {
    // System.out.println("swims in water");
    // }
    // }

    // public static void main(String[] args) {
    // Fish shark = new Fish();// Fish object
    // shark.eat();
    // }
    // }

    // Types of inheritance
    // 1. Sign Level inheritance
    // 2. Multi Level inheritance
    // 3. Hierarchial Level Inheritance

    // //1.Sign Level Inheritance
    // // base class
    // class Animal {
    // String color;// properties

    // void eat() {
    // System.out.println("eats");
    // }

    // void breathe() {
    // System.out.println("Breathes");
    // }

    // }

    // // Derived class/ Sub Class
    // class Fish extends Animal {// extends-khichann
    // int fins; // properties

    // void swim() {
    // System.out.println("swims in water");
    // }
    // }

    // // 2. Multi Level Inheritance
    // public static void main(String[] args) {
    // Dog dobby = new Dog();
    // dobby.eat();
    // dobby.breathe();
    // dobby.legs = 4;
    // System.out.println(dobby.legs);

    // }
    // }

    // // base class
    // class Animal {
    // String color;// properties

    // void eat() {
    // System.out.println("eats");
    // }

    // void breathe() {
    // System.out.println("Breathes");
    // }

    // }

    // // Derived class/ Sub Class
    // class Mammal extends Animal {// extends-khichann
    // int legs; // properties
    // }

    // // Derived class/ Sub Class
    // class Dog extends Mammal {
    // String breed; // properties
    // }

    // 3. Hierarchial Level Inheritance
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathe();
        dobby.legs = 4;
        System.out.println(dobby.legs);

    }
}

// base class
public class Animal {
    String color;// properties

    public void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }

}

// Derived class/ Sub Class
class Mammal extends Animal {// extends-khichann
    int legs; // properties
}
