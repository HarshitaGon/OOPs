class Outer {
    static int data = 100;

    static class StaticNested {
        public void display() {
            System.out.println("Static data: " + data);
        }
    }
}

public class Test {
    public static void main(String[] args) {
        // Created the object of the Inner class without creating an object of the Outer class.
        Outer.StaticNested obj = new Outer.StaticNested();
        obj.display();
    }
}
