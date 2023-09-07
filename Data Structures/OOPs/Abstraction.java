public class Abstraction {

    public static void main(String args[]) {
        /*Horse h = new Horse();
        h.eat();
        h.walk();

        Chicken c = new Chicken();
        c.eat();
        c.walk();*/

        // Animal a = new Animal(); This will give error as we can't create a object for
        // the Abstract Class

        Mustang m = new Mustang();
        // Hierarchy:- Animal -> Horse -> Mustang

    }
}

abstract class Animal {
    Animal(){
        System.out.println("Animal class called");
    }

    void eat() {
        System.out.println("Eats");
    }

    abstract void walk();
    // We can't initiate it inside this beacause this a abstract method, we can
    // define it seprately for all the subclasses created for this function.
}

class Horse extends Animal {
    Horse(){
        System.out.println("Horse class called");
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang Class Called");
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }
}