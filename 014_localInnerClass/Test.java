public class Test {
    void show() {
        int num = 100;       //not declared final, but never modified => effectively final

        class LocalInner {
            void display() {
                System.out.println(num);
            }
        }

        LocalInner li = new LocalInner();
        li.display();
    }

    public static void main(String[] args) {
        new Test().show();
    }
}


/*
    🔍 Key Concepts:
    1. Local Inner Class:

        * A class defined inside a method (here: show()).

        * It behaves like a local variable — only accessible within the method.

        * Cannot be accessed outside the method.

    2. Effectively Final Variable:

        * A local variable is effectively final if its value is not changed after it's declared.

        * num is not explicitly marked final, but since it’s never modified, it is treated as final — hence, accessible inside LocalInner.

    3. Outer Access:

        * You cannot access this LocalInner class or its method from outside the show() method.

        * So, even from main() or another class, you can't directly call display() — you can only call show().
*/
