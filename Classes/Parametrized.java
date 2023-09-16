package Classes;

public class Parametrized {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Shubham");
        Student s3 = new Student(123);

    }
}

class Student {
    String name;
    int roll;

    Student() { // non-parametrized
        System.out.println("Constructor Called");
    }

    Student(String name) { // parametrized
        this.name = name;
    }

    Student(int roll) { // parametrized
        this.roll = roll;
    }
}
