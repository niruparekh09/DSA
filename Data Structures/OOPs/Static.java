public class Static {
    public static void main(String args[]) {

        Student s1 = new Student();
        s1.schoolName = "abc";

        Student s2 = new Student();
        System.out.println(s2.schoolName); // Will be same for all the objects. o.p:- abc

        Student s3 = new Student();
        s3.schoolName = "xyz"; // School name will be updated for all the objects at once

        Student s4 = new Student();
        System.out.println(s4.schoolName); // o.p:- xyz

    }
}

class Student {
    int rollNo;
    String name;

    static String schoolName; // Constant of all the students

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
