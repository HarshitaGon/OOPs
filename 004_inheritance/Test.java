//-------------------------------------Inheritance------------------------------

class Shape {
    public void area() {
        System.out.println("display area");
    }
}

// 1. Single level Inheritance : 1 Base class -> 1 Derived class
class Triangle extends Shape {
    public void area(int length, int height) {
        System.out.println(0.5 * length * height);
    }
}

// 2. Multilevel Inheritance : 1 Base class -> 1 Derived class -> 1 Derived class
class EquiTriangle extends Triangle {
    public void area(int side) {
        System.out.println((Math.sqrt(3) / 4) * side * side);
    }
}

// 3. Hierarchial Inheritance : 1 Base class -> Multiple derived class
class Circle extends Shape {
    public void area(int radius) {
        System.out.println(3.14 * radius * radius);
    }
}

// 4. Hybrid Inheritance : Combination of 2 or more type of inheritance.

public class Test {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(5, 8);        // Single Inheritance : Triangle in inherit by Shape.

        System.out.println("-------------------------------------------------");

        EquiTriangle e1 = new EquiTriangle();
        e1.area();
        e1.area(10, 12);
        e1.area(5);                   // Multi level Inheritance : EquiTriangle is inherit by Triangle.

        System.out.println("-------------------------------------------------");

        Circle c1 = new Circle();
        c1.area();
        c1.area(5);                 // Hierarchical Inheritance : Circle is also inherit by Shape.
    }
}
