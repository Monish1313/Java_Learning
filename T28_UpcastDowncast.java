// T29_CastingDemo.java

class A {
    void show() {
        System.out.println("Show from A");
    }
}

class B extends A {
    void show() {
        System.out.println("Show from B");
    }

    void onlyInB() {
        System.out.println("Method only available in B");
    }
}

public class T28_UpcastDowncast {

    public static void main(String[] args) {

        // --------------------------
        // Upcasting (Child -> Parent)
        // --------------------------
        A obj = new B();   // Upcasting
        obj.show();         // Calls B's show (runtime polymorphism)
        // obj.onlyInB();   // ❌ Not allowed (A reference can't see B-specific)

        // --------------------------
        // Downcasting (Parent -> Child)
        // --------------------------
        B b = (B) obj;      // Safe downcasting (object is actually B)
        b.onlyInB();        // Now allowed
        b.show();           // Calls B version

        // --------------------------
        // Invalid Downcasting
        // --------------------------
        A x = new A();
        // B y = (B) x;     // ❌ Runtime Error: ClassCastException
    }
}
