// A simple class with two instance methods
class Demo {

    void show() {
        System.out.println("Show method executed");
    }

    void display() {
        System.out.println("Display method executed");
    }
}

public class T20_Anonymous_Object {

    public static void main(String[] args) {

        // ---------------- NORMAL OBJECT ----------------
        // Creating object with a reference variable 'd'
        Demo d = new Demo();
        d.show();     // calling method using reference
        d.display();  // can reuse 'd' many times

        System.out.println("--------- Anonymous Object Examples ---------");

        // ---------------- ANONYMOUS OBJECT ----------------
        // Creating an object WITHOUT name and calling show()
        // Object → created → method called → object discarded
        new Demo().show();     // ❗ No reference variable is used

        // Calling another method using another anonymous object
        // Note: This creates a second temporary object
        new Demo().display();

        // Each anonymous object is different and cannot be reused.
    }
}
