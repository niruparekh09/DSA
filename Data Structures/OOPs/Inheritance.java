public class Inheritance {
    public static void main(String args[]) {    
        Fish shark = new Fish();
        shark.eats(); // Via base class
    }
}

// Base class
class Animal {
    String color;

    void eats() {
        System.out.println("Eats");
    }

    void breaths() {
        System.out.println("Breaths");
    }
}

class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}