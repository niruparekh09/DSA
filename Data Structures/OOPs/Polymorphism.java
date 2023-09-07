public class Polymorphism {
    public static void main(String args[]) {
        /*
         * Deer d = new Deer();
         * d.eat(); // Will override the functioninside Animal and execute the function
         * that is
         * // inside the Deer class
         */
        
        /*
         * Calculator add = new Calculator();
         * add.sum(1, 2, 3);
         * add.sum(1.2f, 2.4f);
         * add.sum(1, 2);
         */
    }
}

// Method overriding
class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats grass");
    }
}

// Method overloading
class Calculator {
    void sum(int a, int b) {
        System.out.println(a + b);
    }

    void sum(float a, float b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
