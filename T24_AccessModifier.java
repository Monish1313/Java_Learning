
class Sample {

    // 1. private variable
    private int a = 10;

    // 2. default variable
    int b = 20;

    // 3. protected variable
    protected int c = 30;

    // 4. public variable
    public int d = 40;

    // private method
    private void privateMethod() {
        System.out.println("Private method");
    }

    // default method
    void defaultMethod() {
        System.out.println("Default method");
    }

    // protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // To access private variable & method inside class
    public void showPrivate() {
        System.out.println(a);
        privateMethod();
    }
}

public class T24_AccessModifier {
    public static void main(String[] args) {

        Sample s = new Sample();

        // Accessing variables
        // System.out.println(s.a);  // ❌ private not allowed
        System.out.println(s.b);      // ✔ default
        System.out.println(s.c);      // ✔ protected (same package)
        System.out.println(s.d);      // ✔ public

        // Accessing methods
        // s.privateMethod();        // ❌ not allowed
        s.defaultMethod();            // ✔ allowed
        s.protectedMethod();          // ✔ allowed
        s.publicMethod();             // ✔ allowed

        // Accessing private variable through public method
        s.showPrivate();
    }
}
