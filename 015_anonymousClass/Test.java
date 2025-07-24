interface Animal {
    void sound();
}

public class Test {
    public static void main(String[] args) {
        // Creating anonymous class that implements Animal
        Animal dog = new Animal() {
            public void sound() {
                System.out.println("Dog barks");
            }
        };

        dog.sound();
    }
}


/*
    * new Animal() { ... } creates an anonymous class that implements Animal.

    * We override the sound() method right there without creating a new class like Dog.
*/