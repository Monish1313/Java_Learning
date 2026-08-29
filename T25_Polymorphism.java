// T25_Polymorphism.java

// =======================================================
//                 COMPILE-TIME POLYMORPHISM
//        (Also called METHOD OVERLOADING)
// =======================================================
// Method overloading happens when multiple methods have
// the SAME NAME but DIFFERENT PARAMETERS.
// The method call is resolved at compile time.
class Calculator {

    int add(int a, int b) {       // 2-argument method
        return a + b;
    }

    int add(int a, int b, int c) { // 3-argument method
        return a + b + c;
    }
}



// =======================================================
//                 RUNTIME POLYMORPHISM
//          (Also called METHOD OVERRIDING)
// =======================================================
// Occurs when a parent class reference points to a child class object.
// Which method executes is determined at RUN TIME.
// Child class overrides parent class method.
// Example: Payment → UPI, Card, Wallet
class Payment {

    void pay() {
        System.out.println("Processing generic payment");
    }
}

class UPI extends Payment {

    // Overriding the parent method
    void pay() {
        System.out.println("Payment done through UPI");
    }
}

class Card extends Payment {

    void pay() {
        System.out.println("Payment done through Card");
    }
}

class Wallet extends Payment {

    void pay() {
        System.out.println("Payment done through Wallet");
    }
}



// =======================================================
//                      MAIN CLASS
// =======================================================
public class T25_Polymorphism {

    public static void main(String[] args) {

        // --------------------------------------------------
        //        COMPILE-TIME POLYMORPHISM (OVERLOADING)
        // --------------------------------------------------
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));  // Calls add(int, int)
        System.out.println(calc.add(1, 2, 3)); // Calls add(int, int, int)


        // --------------------------------------------------
        //        RUNTIME POLYMORPHISM (OVERRIDING)
        // --------------------------------------------------
        // Here 'p' is reference of parent class Payment
        // The object it points to decides which pay() runs

        Payment p;

        p = new UPI();
        p.pay();   // Calls UPI's overridden method

        p = new Card();
        p.pay();   // Calls Card's overridden method

        p = new Wallet();
        p.pay();   // Calls Wallet's overridden method



        // =======================================================
        // Difference between:
        //
        //    Payment p = new Payment();  → parent object
        //    Payment p = new UPI();      → parent reference, child object
        //
        // Parent reference can call only parent class methods.
        // But if method is overridden, child’s version executes.
        //
        // EXAMPLE:
        // Payment p = new UPI();
        // p.pay();   → UPI’s method executes (runtime polymorphism)
        // =======================================================
    }
}
