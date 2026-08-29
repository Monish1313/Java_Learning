// T49_ThrowsWithThrowDemo.java

import java.io.FileReader;
import java.io.IOException;

// =====================================================
// CLASS CONTAINING METHODS WITH THROWS
// =====================================================
class Service {

    // -------------------------------------------------
    // CHECKED EXCEPTION with THROWS
    // -------------------------------------------------
    // IOException is a checked exception
    // Method declares it using throws
    void readFile() throws IOException {

        // Risky code that may cause IOException
        FileReader fr = new FileReader("input.txt");
        fr.read();
    }

    // -------------------------------------------------
    // UNCHECKED EXCEPTION with THROW
    // -------------------------------------------------
    // ArithmeticException is unchecked
    // throws declaration is OPTIONAL
    void withdraw(int balance, int amount) throws ArithmeticException {

        if (amount > balance) {
            // Explicitly throwing an unchecked exception
            throw new ArithmeticException("Insufficient balance");
        }

        System.out.println("Withdrawal successful");
    }
}

// =====================================================
// MAIN CLASS
// =====================================================
public class T40_Throws {

    public static void main(String[] args) {

        Service s = new Service();

        try {

            // -----------------------------------------
            // Calling method with CHECKED exception
            // Caller MUST handle or declare
            // -----------------------------------------
            s.readFile();

            // -----------------------------------------
            // Calling method that THROWS unchecked exception
            // Handling is OPTIONAL but done here
            // -----------------------------------------
            s.withdraw(1000, 2000);

        }
        catch (IOException e) {
            // Handling checked exception
            System.out.println("IOException handled: File not found");
        }
        catch (ArithmeticException e) {
            // Handling unchecked exception thrown using 'throw'
            System.out.println("ArithmeticException handled: " + e.getMessage());
        }

        // Program continues after exception handling
        System.out.println("Program continues normally");
    }
}
