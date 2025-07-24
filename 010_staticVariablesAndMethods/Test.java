class Student {
    String name;
    static String school;       //static variables

    public static void changeSchool() {         //static methods
        school = "new school";
        System.out.println("Changed school name : " + school);
    }
}

public class Test {
    public static void main(String[] args) {
        Student.school = "ABC";
        Student s1 = new Student();
        s1.name = "Harshita";
        System.out.println("Student name and school : " + s1.name + ", " + s1.school);
        Student.changeSchool();          //Automatically change the schoolName for every obj created(bcz of static method).
    }
}
