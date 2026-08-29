// T26_FinalKeyword.java

// ---------------------------
// final variable example
// ---------------------------
class Example1 {
    final int num = 10;   // final variable (constant)

    void show() {
        System.out.println("Final variable value: " + num);
        // num = 20;  // ❌ ERROR – cannot change final variable
    }
}


// ---------------------------
// final method example
// ---------------------------
class Example2 {
    final void msg() {   // final method cannot be overridden
        System.out.println("Final method in Example2");
    }
}

class Example2Child extends Example2 {
    // void msg() {}    // ❌ ERROR – cannot override final method
}


// ---------------------------
// final class example
// ---------------------------
final class Example3 {   // final class cannot be inherited
    void test() {
        System.out.println("This is a final class");
    }
}

// class Example4 extends Example3 { }   // ❌ ERROR – cannot extend final class



// ---------------------------
// MAIN CLASS
// ---------------------------
public class T26_FinalKeyword {

    public static void main(String[] args) {

        // final variable example
        Example1 obj1 = new Example1();
        obj1.show();


        // final method example
        Example2 obj2 = new Example2();
        obj2.msg();   // calling final method


        // final class example
        Example3 obj3 = new Example3();
        obj3.test();
    }
}
