public class Interfaces {
    public static void main(String args[]) {

    }
}

// Multiple Inheritance using Interface
interface Herbivore {
    void veg();
}

interface Carnivore {
    void nonveg();
}

class Bear implements Herbivore, Carnivore {
    public void veg() {
        System.out.println("Eats grass,trees,branches etc.");
    }

    public void nonveg() {
        System.out.println("Consumes other animals as well.");
    }
}

interface Chess {
    void move();
}

class Queen implements Chess {
    // public is necessary because we are implementing a interface and all methods
    // should be public (not of default type).
    public void move() {
        System.out.println("Moves left,right,up,down and Diagonaly");
    }
}

class Rook implements Chess {
    public void move() {
        System.out.println("Moves up, down and digonally by one step");
    }
}

class king implements Chess {
    public void move() {
        System.out.println("Moves in all direction by one step");
    }
}