// Class name → PascalCase
class EmployeeDetails {

    // Constant → UPPER_CASE
    static final double MAX_SALARY = 200000.0;

    // Variables → camelCase
    private String employeeName;
    private int employeeAge;

    // Constructor → same as class name (PascalCase)
    EmployeeDetails(String employeeName, int employeeAge) {
        this.employeeName = employeeName;  // using this → camelCase variable
        this.employeeAge = employeeAge;
    }

    // Method → camelCase
    void printDetails() {
        System.out.println(
            "Employee Name: " + employeeName +
            ", Age: " + employeeAge +
            ", Max Salary: " + MAX_SALARY
        );
    }
}

// Interface name → PascalCase
interface Printable {
    void print();   // method → camelCase
}

// Enum name → PascalCase; constants → UPPER_CASE
enum Department {
    HR, SALES, IT
}

// Box class WITHOUT generics → stores Object type
class Box {
    private Object item;       // can store any type

    void setItem(Object item) {
        this.item = item;
    }

    Object getItem() {
        return item;
    }
}

// MAIN CLASS (also PascalCase)
public class T19_Naming_Convention {

    // main method → camelCase
    public static void main(String[] args) {

        // Creating object (variable → camelCase)
        EmployeeDetails emp = new EmployeeDetails("Monish P", 25);
        emp.printDetails();

        // Using enum
        Department dept = Department.IT;
        System.out.println("Department: " + dept);

        // Using Box class (without generics)
        Box box = new Box();
        box.setItem("Java Naming Conventions");   // Storing String
        System.out.println("Box contains: " + box.getItem());

        box.setItem(123);                         // Storing Integer
        System.out.println("Box now contains: " + box.getItem());
    }
}
