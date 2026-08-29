// T43_FunctionalInterfaceReturnDemo.java

// =====================================================
// FUNCTIONAL INTERFACE
// =====================================================
// Functional interface with ONE abstract method
// This method RETURNS an int value
@FunctionalInterface
interface Calculator {

    // Single abstract method with return value
    int add(int a, int b);
}


// =====================================================
// 1. NORMAL CLASS IMPLEMENTATION
// =====================================================
class NormalCalculator implements Calculator {

    // Traditional implementation
    public int add(int a, int b) {
        return a + b;
    }
}


// =====================================================
// MAIN CLASS
// =====================================================
public class T37_LambdaWithReturn {

    public static void main(String[] args) {

        // -------------------------------------------------
        // 1️⃣ WITHOUT LAMBDA (Normal class)
        // -------------------------------------------------
        Calculator c1 = new NormalCalculator();
        System.out.println("Normal class result: " + c1.add(10, 20));

        System.out.println("--------------------------------");

        // -------------------------------------------------
        // 2️⃣ ANONYMOUS INNER CLASS
        // -------------------------------------------------
        Calculator c2 = new Calculator() {

            // Implementation inside anonymous class
            public int add(int a, int b) {
                return a + b;
            }
        };

        System.out.println("Anonymous class result: " + c2.add(30, 40));

        System.out.println("--------------------------------");

        // -------------------------------------------------
        // 3️⃣ LAMBDA EXPRESSION WITH RETURN
        // -------------------------------------------------
        // Shortest form using lambda
        Calculator c3 = (a, b) -> {
            return a + b;   // explicit return
        };

        System.out.println("Lambda result: " + c3.add(50, 60));
    }
}
