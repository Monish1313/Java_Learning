// Constructor & parameterized constructor
public class Student {

    String name;
    int age;

    // Public default constructor (no parameters)
    public Student() {
        name = "Not Assigned";
        age  = 0;
        System.out.println("Default Constructor Executed");
    }
    /* Short Summary — this keyword in Java

this refers to the current object of the class.
Used to access current object's variables and methods.
Needed when local variable and instance variable names are the same.
Helps differentiate between:
this.name → class variable
name → constructor/method parameter
Can call:
    this.variable
    this.method()
     */

    // Public parameterized constructor
    public Student(String name, int age) {
        this.name = name;  // 'this' refers to current object's variable
        this.age = age;
        System.out.println("Parameterized Constructor Executed");
    }
}

public class T15_Constructors {
    public static void main(String[] args) {

        // Calling public default constructor
        Student s1 = new Student();
        System.out.println(s1.name + " - " + s1.age);

        // Calling public parameterized constructor
        Student s2 = new Student("Monish", 25);
        System.out.println(s2.name + " - " + s2.age);
    }
}
