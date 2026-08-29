// T31_InnerClassDemo.java

class Outer {

    int outerValue = 10;

    // ------------------------------------
    // 1. MEMBER INNER CLASS (Non-static)
    // ------------------------------------
    class Inner {

        int innerValue = 20;

        void display() {
            System.out.println("Inside Inner class");
            System.out.println("outerValue = " + outerValue);  // can access outer variables
            System.out.println("innerValue = " + innerValue);
        }
    }


    // ------------------------------------
    // 2. STATIC INNER CLASS
    // ------------------------------------
    static class StaticInner {

        void show() {
            System.out.println("Inside Static Inner class");
        }
    }


    // Method in Outer class
    void outerMethod() {
        System.out.println("Inside Outer class method");
    }
}


// ------------------------------------
// MAIN CLASS
// ------------------------------------
public class T30_InnerClass {

    public static void main(String[] args) {

        // ------------------------------------
        // Creating object of Outer class
        // ------------------------------------
        Outer outer = new Outer();
        outer.outerMethod();

        System.out.println("--------------------------------");

        // ------------------------------------
        // Creating object of INNER class
        // Syntax:
        //      Outer.Inner obj = outer.new Inner();
        // ------------------------------------
        Outer.Inner innerObj = outer.new Inner();
        innerObj.display();

        System.out.println("--------------------------------");

        // ------------------------------------
        // Creating object of STATIC INNER CLASS
        // Syntax:
        //      Outer.StaticInner obj = new Outer.StaticInner();
        // ------------------------------------
        Outer.StaticInner staticObj = new Outer.StaticInner();
        staticObj.show();
    }
}
