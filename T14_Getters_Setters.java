// Class with private variables, getters and setters
class Student {

    // Private variables
    private String name;
    private int age;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String n) {
        name = n;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int a) {
        if (a > 0) {        // simple validation
            age = a;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}


// Main class
public class T14_Getters_Setters {
    public static void main(String[] args) {

        // Create an object
        Student s = new Student();

        // Use setter methods to set values
        s.setName("Monish");
        s.setAge(25);

        // Use getter methods to get values
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
