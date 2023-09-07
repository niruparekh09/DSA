public class Inheritance {
    public static void main(String args[]) {
        /*
         * //Multilevel Inheritance
         * Dog dobby = new Dog();
         * dobby.eats();
         * dobby.legs = 4;
         */
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

class Mammal extends Animal {
    void walks(){
        System.out.println("Walk");
    }
}

class Fish extends Animal {
    void swims(){
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void flys(){
        System.out.println("Flys");
    }
}

// Derived Class
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("Swims in water");
// }
// }