// T33_Enum.java

// ==========================================================
// ENUM DECLARATION
// ==========================================================
// enum is a special Java type used to define a FIXED set of
// CONSTANT objects.
//
// Each enum constant is actually an OBJECT of the enum class.
//
// Here, Status can have ONLY these values:
// SUCCESS, FAILURE, PENDING
// ==========================================================
enum Status {

    // ------------------------------------------------------
    // ENUM CONSTANTS
    // ------------------------------------------------------
    // These are objects created by the JVM.
    // The values inside brackets are passed to the constructor.
    //
    // Internally, JVM does something like:
    // new Status(200);
    // new Status(500);
    // new Status(100);
    // ------------------------------------------------------
    SUCCESS(200),
    FAILURE(500),
    PENDING(100);

    // ------------------------------------------------------
    // ENUM VARIABLE
    // ------------------------------------------------------
    // This is an INSTANCE variable of the enum.
    // Each enum constant has its OWN copy of this variable.
    //
    // SUCCESS.code  -> 200
    // FAILURE.code  -> 500
    // PENDING.code  -> 100
    // ------------------------------------------------------
    private int code;

    // ------------------------------------------------------
    // ENUM CONSTRUCTOR
    // ------------------------------------------------------
    // This constructor is:
    // ✔ Called automatically by JVM
    // ✔ Called ONCE for EACH enum constant
    // ✔ Always private (implicitly)
    //
    // You CANNOT create enum objects using 'new'.
    // ------------------------------------------------------
    Status(int code) {
        this.code = code;

        // This print executes DURING class loading,
        // BEFORE main() starts
        System.out.println("Constructor called for " + this);
    }

    // ------------------------------------------------------
    // ENUM METHOD
    // ------------------------------------------------------
    // Normal method to access enum variable.
    // Used instead of accessing variable directly.
    // ------------------------------------------------------
    int getCode() {
        return code;
    }
}


// ==========================================================
// MAIN CLASS
// ==========================================================
public class T33_Enum {

    public static void main(String[] args) {

        // main() runs AFTER all enum constants are created
        System.out.println("Inside main()");
        System.out.println("--------------------------------");

        // --------------------------------------------------
        // USING ENUM CONSTANT
        // --------------------------------------------------
        // Status.SUCCESS refers to the enum object SUCCESS
        // --------------------------------------------------
        Status s = Status.SUCCESS;

        // --------------------------------------------------
        // Printing enum details
        // --------------------------------------------------
        System.out.println("Status name   : " + s);
        System.out.println("Status code   : " + s.getCode());

        // ordinal() gives the POSITION of enum constant
        // Index starts from 0
        System.out.println("Status ordinal: " + s.ordinal());

        System.out.println("--------------------------------");

        // --------------------------------------------------
        // values() METHOD
        // --------------------------------------------------
        // values() returns ALL enum constants as an array
        // Used mostly for looping
        // --------------------------------------------------
        for (Status st : Status.values()) {
            System.out.println(
                "Name: " + st +
                ", Code: " + st.getCode() +
                ", Ordinal: " + st.ordinal()
            );
        }
    }
}
