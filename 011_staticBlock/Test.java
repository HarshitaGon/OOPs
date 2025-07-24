public class Test {
    //Static variables :-
    static int a = 10;
    static int b;

    //Static block :-
    static {
        System.out.println("Static block initialized");
        b = a * 4;
    }

    public static void main(String[] args) {
        System.out.println("From main :-");
        System.out.println("Value of a : " + a);
        System.out.println("Value of b: " + b);
    }
}

/*
    What happens under the hood:

    1) JVM loads the class Test to start execution.

    2) While loading the class:

        * It first allocates memory for static variables a and b.

        * It executes any static blocks immediately — as part of class loading.

        * So System.out.println("Static block initialized"); runs first.

        * Then sets b = a * 4; → b = 10 * 4 = 40

    3) After class loading is complete, then the main() method starts running.
*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


// class Geeks {
//     //Static variables :-
//     static int a = 10;
//     static int b;

//     //Static block :-
//     static {
//         System.out.println("Sttaic block initialized");
//         b = a * 4;
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         System.out.println("From main :-");
//         System.out.println("Value of a : " + Geeks.a);
//         System.out.println("Value of b: " + Geeks.b);
//     }
// }

/*
    Yes, static blocks do execute before main() — but only when the class
    containing the static block is first loaded. And The class is loaded only
    when it is first accessed.

    And here it means :
    * JVM starts with the main() method of the Test class.

    * It runs: System.out.println("From main :-"); ✅ ✅ ✅
        → No reference to Geeks yet, so static block of Geeks doesn't run yet.

    * The moment you write: Geeks.a → now JVM sees that Geeks class is needed
        → only now it loads Geeks class into memory → static block runs.

    Therefore, The output of above code is :
    From main :-
    Static block initialized
    Value of a : 10
    Value of b: 40
*/

