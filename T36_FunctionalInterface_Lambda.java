// T42_FunctionalInterfaceAllWays.java

// =====================================================
// FUNCTIONAL INTERFACE
// =====================================================
// A functional interface has EXACTLY ONE abstract method.
// This allows it to be implemented using:
// 1) Normal class
// 2) Anonymous inner class
// 3) Lambda expression
@FunctionalInterface
interface Greeting {

    // Single abstract method
    void greet();
}


// =====================================================
// 1. NORMAL CLASS IMPLEMENTATION (WITHOUT LAMBDA)
// =====================================================
// Traditional OOP way
class NormalGreeting implements Greeting {

    // Providing implementation of abstract method
    public void greet() {
        System.out.println("Hello from normal class implementation");
    }
}


// =====================================================
// MAIN CLASS
// =====================================================
public class T36_FunctionalInterface_Lambda {

    public static void main(String[] args) {

        // -------------------------------------------------
        // 1️⃣ WITHOUT LAMBDA (Normal class)
        // -------------------------------------------------
        // A separate class implements the interface
        Greeting g1 = new NormalGreeting();
        g1.greet();

        System.out.println("--------------------------------");

        // -------------------------------------------------
        // 2️⃣ ANONYMOUS INNER CLASS
        // -------------------------------------------------
        // No class name is given.
        // Implementation is provided at object creation.
        // Used for one-time use implementations.
        Greeting g2 = new Greeting() {

            // Overriding the abstract method
            public void greet() {
                System.out.println("Hello from anonymous inner class");
            }
        };

        g2.greet();

        System.out.println("--------------------------------");

        // -------------------------------------------------
        // 3️⃣ LAMBDA EXPRESSION
        // -------------------------------------------------
        // Shortest and cleanest way.
        // No class, no method name, only logic.
        // Works ONLY because Greeting is a functional interface.
        Greeting g3 = () -> {
            System.out.println("Hello from lambda expression");
        };

        g3.greet();
    }
}
