interface Animal {
    int eyes = 2;
    void walk();
}

interface Harbivore {
    void eat();
}

class Horse implements Animal, Harbivore {            //Multiple inheritance
    public void walk() {
        System.out.println("Horse walks on 4 legs");
    }

    public void eat() {
        System.out.println("Horse only eats plants");
    }
}

class Chicken implements Animal {
    public void walk() {
        System.out.println("Chicken walks on 2 legs");
    }
}

public class Test {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();
        System.out.println("Horse Eyes : " + h.eyes);

        System.out.println("-------------------------------------------------");
        Chicken c = new Chicken();
        c.walk();
        System.out.println("Chicken Eyes : " + c.eyes);
    }
}
