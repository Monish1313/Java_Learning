// Parent class
class Parent {

    int pnum;

    // 1. Parent default constructor
    Parent() {
        System.out.println("Parent default constructor");
        pnum = 10;
    }

    // 2. Parent parameterized constructor
    Parent(int pnum) {
        this.pnum = pnum;    // using 'this' to assign instance variable
        System.out.println("Parent parameterized constructor");
    }

    void parentMethod() {
        System.out.println("Parent method");
    }
}

// Child class
class Child extends Parent {

    int cnum;

    // 3. Child default constructor
    Child() {
        this(200);               // calling child parameterized constructor using this()
        System.out.println("Child default constructor");
    }

    // 4. Child parameterized constructor
    Child(int cnum) {
        super(100);              // calling parent parameterized constructor
        this.cnum = cnum;        // assigning value using this
        System.out.println("Child parameterized constructor");

        System.out.println("Parent num using super: " + super.pnum);
        System.out.println("Child num using this:  " + this.cnum);

        super.parentMethod();    // calling parent method
        this.childMethod();      // calling child method
    }

    void childMethod() {
        System.out.println("Child method");
    }
}

// Main class
public class T18_This_Super {
    public static void main(String[] args) {

        System.out.println("Creating object with default constructor:");
        Child obj1 = new Child();

        System.out.println("\nCreating object with parameterized constructor:");
        Child obj2 = new Child(500);
    }
}
