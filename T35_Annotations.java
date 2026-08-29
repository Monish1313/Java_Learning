// T38_AnnotationDemo.java

// ======================================================
// Parent class
// ======================================================
class Parent {

    // Normal method in parent class
    void display() {
        System.out.println("Parent display");
    }
}

// ======================================================
// Child class
// ======================================================
class Child extends Parent {

    // --------------------------------------------------
    // @Override Annotation
    // --------------------------------------------------
    // @Override tells the compiler:
    // "This method MUST override a method from the parent class"
    //
    // If method name or parameters are wrong,
    // compiler will give an ERROR.
    //
    // It helps:
    // ✔ Avoid mistakes
    // ✔ Improve code readability
    // ✔ Catch bugs at compile time
    // --------------------------------------------------
    @Override
    void display() {
        System.out.println("Child display");
    }

    // --------------------------------------------------
    // @Deprecated Annotation
    // --------------------------------------------------
    // @Deprecated marks this method as OLD or NOT RECOMMENDED.
    //
    // When this method is called:
    // ✔ Compiler shows a warning
    // ✔ Code still works
    //
    // Used when:
    // ✔ Method should not be used in future
    // ✔ A better alternative exists
    // --------------------------------------------------
    @Deprecated
    void oldFeature() {
        System.out.println("Old feature");
    }
}

// ======================================================
// Main class
// ======================================================
public class T35_Annotations {

    // --------------------------------------------------
    // @SuppressWarnings Annotation
    // --------------------------------------------------
    // @SuppressWarnings("deprecation") tells the compiler:
    // "Do NOT show warnings for deprecated method usage"
    //
    // Used when:
    // ✔ You know the warning
    // ✔ You intentionally want to ignore it
    // --------------------------------------------------
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

        Child c = new Child();

        // Calls overridden method (runtime polymorphism)
        c.display();

        // Calls deprecated method
        // Normally compiler gives a warning,
        // but warning is suppressed using @SuppressWarnings
        c.oldFeature();
    }
}
