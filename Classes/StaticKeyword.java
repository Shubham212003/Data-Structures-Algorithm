// javac Classes/StaticKeyword.java
// java Classes.StaticKeyword

package Classes;

public class StaticKeyword {
    public static void main(String[] args) {
        Student.schoolName = "Saraswati"; // Access the static variable using the class name

        Student s1 = new Student();
        System.out.println(s1.schoolName); // You can also access it through an instance, but it's not recommended

        Student s2 = new Student();
        System.out.println(s2.schoolName); // It will also print "Saraswati"

        Student s3 = new Student();
        s3.schoolName = "ABC";
    }
}

class Student {
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }
}
