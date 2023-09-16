package Classes;

class GettersAndSetters {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // creating an object
        p1.setColor("blue");
        System.out.println(p1.getColor());

        p1.setTip(5); // Set the tip value
        System.out.println(p1.getTip()); // Print the tip value
    }
}

class Pen {
    private String color;
    private int tip;

    // Getter for color
    String getColor() {
        return this.color;
    }

    // Getter for tip
    int getTip() {
        return this.tip;
    }

    // Setter for color
    void setColor(String newColor) {
        this.color = newColor;
    }

    // Setter for tip
    void setTip(int newTip) {
        this.tip = newTip;
    }
}
