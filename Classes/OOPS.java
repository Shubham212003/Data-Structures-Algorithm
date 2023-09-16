package Classes;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.getColor()); // Use getter method
        p1.setTip(5);
        System.out.println(p1.getTip()); // Use getter method
        p1.setColor("Yellow"); // You should use the setter method to change color
        System.out.println(p1.getColor());

        BankAccount myAcc = new BankAccount();
        myAcc.setUsername("shubham Bhople"); // Use setter method
        System.out.println(myAcc.getUsername()); // Use getter method
        myAcc.setPassword("abcd");
        System.out.println(myAcc.getPassword());
    }
}

class BankAccount {
    private String username; // Make the field private
    private String password;

    public void setUsername(String usr) {
        username = usr;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String pwd) {
        password = pwd;
    }

    public String getPassword() {
        return password;
    }
}

class Pen {
    private String color;
    private int tip;

    public void setColor(String newColor) {
        color = newColor;
    }

    public String getColor() {
        return color;
    }

    public void setTip(int newTip) {
        tip = newTip;
    }

    public int getTip() {
        return tip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int math, int chem) {
        percentage = (phy + math + chem) / 3.0f; // Ensure floating-point division
    }
}
