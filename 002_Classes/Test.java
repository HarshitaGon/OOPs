//create class i.e pen
class Pen {
    String color;
    String type;

    public void write() {         //write() known as members/methods of class
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println("pen's color : " + this.color);
    }
}

// create another class i.e Student
class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("Student name : " + this.name);
        System.out.println("Student age : " + this.age);
    }

    /*------------------------------Constructor------------------------------------- */
    /*  Constructor calls only once in a class & don't need to write return type.
        If user don't call constructor then java automatically call the constructor itself.
    */


    // ** Define Non-paramterized Constructor :-
    Student() {
        System.out.println("Constructor called");
    }

    // ** Define Parameterized Constructor :-
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;

    //       /* this.name/age -> Name of object defined in class.
    //          name/age; -> parameter define in constructor.
    //       */
    // }


    // ** Define Copy Constructor :-
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
}


public class Test {
    public static void main(String[] args) {
        Pen pen1 = new Pen();     //pen1 is the object of class Pen and Pen() : contructor
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();

        pen1.write();

        System.out.println("---------------------------------------------------------------");

        Student s1 = new Student();   //*name of the contructor and class always same.
        // Student s1 = new Student("Harshita", 20);   // passing argument to paramterized constructor.
        s1.name = "harshita";
        s1.age = 20;

        // calling copy constructor :
        Student s2 = new Student(s1);

        s2.printInfo();
    }
}
