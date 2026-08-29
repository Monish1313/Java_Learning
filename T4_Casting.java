public class T4_Casting {

    public static void main(String[] args) {

        System.out.println("========== 1. WIDENING (Automatic) ==========");

        byte b = 10;
        short s = b;         // byte → short
        int i = s;           // short → int
        long l = i;          // int → long
        float f = l;         // long → float
        double d = f;        // float → double

        char c = 'A';
        int i2 = c;          // char → int

        System.out.println("byte→short: " + s);
        System.out.println("short→int: " + i);
        System.out.println("int→long: " + l);
        System.out.println("long→float: " + f);
        System.out.println("float→double: " + d);
        System.out.println("char→int: " + i2); // 65


        System.out.println("\n========== 2. NARROWING (Explicit Cast) ==========");

        double d2 = 10.99;
        int i3 = (int) d2;   // fractional loss
        int i4 = 300;
        byte b2 = (byte) i4; // overflow

        long l2 = 70000;
        char c2 = (char) l2; // narrowing into char (wraps)

        System.out.println("double→int: " + i3);
        System.out.println("int→byte (overflow): " + b2);
        System.out.println("long→char: " + (int)c2);


        System.out.println("\n========== 3. CHAR CONVERSIONS ==========");

        char c3 = 65;                  // decimal
        char c4 = 0x41;                // hex
        char c5 = 0101;                // octal
        char c6 = 0b1000001;           // binary
        char c7 = '\u0041';            // unicode

        System.out.println("decimal 65 → " + c3);
        System.out.println("hex 0x41 → " + c4);
        System.out.println("octal 0101 → " + c5);
        System.out.println("binary 0b1000001 → " + c6);
        System.out.println("unicode \\u0041 → " + c7);


        System.out.println("\n========== 4. FLOATING-POINT CONVERSIONS ==========");

        int i5 = 100;
        float f2 = i5;                 // widening
        double d3 = 3.14159;
        float f3 = (float) d3;         // narrowing

        System.out.println("int→float: " + f2);
        System.out.println("double→float (narrow): " + f3);


        System.out.println("\n========== 5. STRING CONVERSIONS ==========");

        int num = 123;
        String str = String.valueOf(num);     // int→String
        int num2 = Integer.parseInt("456");   // String→int

        System.out.println("int→String: " + str);
        System.out.println("String→int: " + num2);


        System.out.println("\n========== 6. WRAPPER CONVERSIONS ==========");

        Integer boxed = num;   // autoboxing
        int unboxed = boxed;   // unboxing

        System.out.println("Autoboxing int→Integer: " + boxed);
        System.out.println("Unboxing Integer→int: " + unboxed);


        System.out.println("\n========== 7. REFERENCE CASTING ==========");

        Animal a = new Dog();       // upcast
        a.speak();

        Dog d4 = (Dog) a;           // downcast
        d4.speak();

        System.out.println("Upcasting and Downcasting done.");


        System.out.println("\n========== 8. ILLEGAL CONVERSIONS ==========");

        System.out.println("boolean cannot convert to any numeric type.");
    }
}


// Helper classes for reference casting
class Animal {
    void speak() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void speak() { System.out.println("Dog barks"); }
}
