import java.util.*;

public class OOPSBasic {
    public static void main(String args[]) {
        Pen p1 = new Pen(); // Created new object p1 for class pen
        p1.setColor("Blue");
        System.out.println(p1.getColor());
    }
}

// Some classes examples

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color; // This is used for getColor of that specified object. E.G. p1 in above code
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String newColor) {
        this.color = newColor; // here the color is set for that particular object
    }

    void setTip(int tip) {
        this.tip = tip; // here the tip is set for that particular object
        // here tip is the external variable and this is used for telling that the
        // variable is from this class itself
    }
}
