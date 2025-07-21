abstract class Animal {
    abstract void walk();

    Animal() {
        System.out.println("You are creating a new animal");
    }

    public void eat() {
        System.out.println("Animal eats");
    }
}

class Horse extends Animal {
    Horse () {
        System.out.println("Created a horse");
        
        /*  Here compiler first call the contructor of parent class i.e Animal()
            then call the constructor of child class. This is called Constructor Chaining.
        */
    }

    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Test {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        h.eat();

        System.out.println("-------------------------------------------------");

        Chicken c = new Chicken();
        c.walk();

        // Animal a = new Animal();
        // a.walk();

        /*
            Animal is abstract; cannot be instantiated
            Animal a = new Animal();
            So it gives a run-time error.
         */

    }

}
