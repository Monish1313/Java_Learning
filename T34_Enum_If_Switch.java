// T37_EnumIfSwitchDemo.java

// ==================================================
// ENUM DECLARATION
// ==================================================
// Enum represents a fixed set of constants.
// Each constant is an object of the enum.
enum Status {

    SUCCESS(200),
    FAILURE(500),
    PENDING(100);

    // Instance variable (each enum constant has its own copy)
    private int code;

    // Constructor (called once per enum constant)
    Status(int code) {
        this.code = code;
    }

    // Getter method
    int getCode() {
        return code;
    }
}


// ==================================================
// MAIN CLASS
// ==================================================
public class T34_Enum_If_Switch {

    public static void main(String[] args) {

        // Using enum constant
        Status status = Status.FAILURE;

        System.out.println("Using IF-ELSE");
        System.out.println("----------------------");

        // =============================================
        // ENUM WITH IF - ELSE
        // =============================================
        if (status == Status.SUCCESS) {
            System.out.println("Operation successful");
            System.out.println("Code: " + status.getCode());

        } else if (status == Status.FAILURE) {
            System.out.println("Operation failed");
            System.out.println("Code: " + status.getCode());

        } else if (status == Status.PENDING) {
            System.out.println("Operation pending");
            System.out.println("Code: " + status.getCode());
        }

        System.out.println();
        System.out.println("Using SWITCH-CASE");
        System.out.println("----------------------");

        // =============================================
        // ENUM WITH SWITCH - CASE
        // =============================================
        // In switch, we use enum constants directly
        // (no need to write Status.SUCCESS inside case)
        switch (status) {

            case SUCCESS:
                System.out.println("Operation successful");
                System.out.println("Code: " + status.getCode());
                break;

            case FAILURE:
                System.out.println("Operation failed");
                System.out.println("Code: " + status.getCode());
                break;

            case PENDING:
                System.out.println("Operation pending");
                System.out.println("Code: " + status.getCode());
                break;
        }
    }
}
