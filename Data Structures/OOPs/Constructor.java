public class Constructor {
    public static void main(String args[]) {
        Student s1 = new Student();// Constructor is called. We send the name as obj is created
        // System.out.println(s1.name);
        s1.name = "Nirav";
        s1.rollNo = 19;
        s1.password = "Abc";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 100;
        Student s2 = new Student(s1);
        s2.password ="xyz";
        s1.marks[2] = 10;
        for(int i=0; i<s2.marks.length;i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[];

    // Shallow Copy constructor
    /*
     * Student(Student s1){
     * marks = new int[3];
     * this.name = name;
     * this.rollNo = rollNo;
     * this.marks = marks;
     * }
     */

    // Deep Copy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = name;
        this.rollNo = rollNo;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Even if constructor isn't created when we create a obj. java by default
    // creates a constructor.
    // Non Parameterized
    Student() {
        marks = new int[3];
        System.out.println("Constructor is called");
    }

    // Parameterized
    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int rollNo) {
        marks = new int[3];
        this.rollNo = rollNo;
    }
}
