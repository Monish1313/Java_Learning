// T54_TryWithResources_Backend.java

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T42_TryWithResources {

    public static void main(String[] args) {

        // -------------------------------------------------
        // TRY-WITH-RESOURCES
        // -------------------------------------------------
        // BACKEND WORKING (STEP BY STEP):
        //
        // 1. JVM creates FileReader object
        // 2. JVM creates BufferedReader object using FileReader
        // 3. JVM internally stores references to both resources
        // 4. Code inside try block is executed
        // 5. After try block finishes (success or exception),
        //    JVM AUTOMATICALLY calls close() on resources
        // 6. Resources are closed in REVERSE order of creation
        //    (BufferedReader → FileReader)
        // -------------------------------------------------
        try (
            FileReader fr = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(fr)
        ) {

            // JVM executes business logic using the resource
            String line;

            // Reading data line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        }
        // -------------------------------------------------
        // EXCEPTION HANDLING
        // -------------------------------------------------
        // If any exception occurs:
        // - JVM jumps to catch block
        // - BUT still ensures close() is called on resources
        // -------------------------------------------------
        catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        // -------------------------------------------------
        // PROGRAM CONTINUES
        // -------------------------------------------------
        // At this point:
        // - All resources are already closed
        // - No memory leak
        // - No finally block needed
        // -------------------------------------------------
        System.out.println("Program continues normally");
    }
}
