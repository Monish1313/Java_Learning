// T45_ThrowAndCustomException.java

// --------------------------------------------
// 1️⃣ Custom Exception Class
// --------------------------------------------
// User-defined exception
// Extends RuntimeException (unchecked exception)
class InvalidAgeException extends RuntimeException {

    // Constructor to pass error message
    InvalidAgeException(String message) {
        super(message);
    }
}


// --------------------------------------------
// MAIN CLASS
// --------------------------------------------
public class T39_ThrowAndCustomException {

    // Method to check age
    static void checkAge(int age) {

        // --------------------------------------------
        // 2️⃣ Using throw keyword
        // --------------------------------------------
        // Manually throwing an exception
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("Access granted");
    }

    public static void main(String[] args) {

        try {

            // Example 1: Throwing built-in exception
            int balance = 1000;
            int withdraw = 2000;

            if (withdraw > balance) {
                throw new ArithmeticException("Insufficient balance");
            }

            System.out.println("Withdrawal successful");

            // Example 2: Throwing custom exception
            checkAge(15);

        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Built-in Exception caught: " + e.getMessage());
        }
        catch (Exception e) {
            // Parent exception block (always at end)
            System.out.println("General exception caught");
        }

        System.out.println("Program continues normally");
    }
}
