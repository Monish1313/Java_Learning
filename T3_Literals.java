public class T3_Literals {
    public static void main(String[] args)
    {


        // 1️⃣ INTEGER LITERALS
        int decimal = 100;            // Decimal
        int binary = 0b1010;          // Binary
        int octal = 012;              // Octal
        int hex = 0x1A;               // Hexadecimal
        long bigLong = 10_000L;       // Long literal with underscore

        // 2️⃣ FLOATING-POINT LITERALS
        float floatVal = 3.14f;       // Float literal
        double doubleVal = 3.14;      // Double literal
        double sci = 1.2e3;           // Scientific notation
        double hexFloat = 0x1.1p3;    // Hexadecimal floating-point
        // Binary & octal floating point is not allowed.

        // 3️⃣ CHARACTER LITERALS 
        char decChar = 65;              // 'A'
        char octChar = 0101;            // Octal integer → 'A' =>Converts 0101 → 65 → 'A'
        char octChar2 = '\101';          // Octal (escape sequence) → 'A' =>Converts directly to 'A'
        char hexChar = 0x41;            // Hex  → 'A'
        char binChar = 0b01000001;      // Binary → 'A'
        char uniChar = '\u0041';        // Unicode → 'A'
        // \u000A System.out.println("Hello"); //unicode works in comment.
        //char maximum - 16 bits not support beyond that range.


        // 4️⃣ STRING LITERALS
        String str1 = "Hello World";  // Normal string
        String str2 = "Line1\nLine2"; // With escape
        String textBlock = """
                           This is a
                           Java Text Block.
                           """;       // Multi-line string (Java 15+)

        // 5️⃣ BOOLEAN LITERALS
        boolean flagTrue = true;
        boolean flagFalse = false;

        // 6️⃣ NULL LITERAL
        String empty = null;

        // OUTPUT
        System.out.println("INTEGER LITERALS:");
        System.out.println(decimal + ", " + binary + ", " + octal + ", " + hex + ", " + bigLong);

        System.out.println("\nFLOATING-POINT LITERALS:");
        System.out.println(floatVal + ", " + doubleVal + ", " + sci + ", " + hexFloat);

        System.out.println("\nChar Literals:");
        System.out.println(decChar + ", " + octChar + ", " + octChar2 + ", " + hexChar + ", " + binChar + ", " + uniChar);

        System.out.println("\nSTRING LITERALS:");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(textBlock);

        System.out.println("\nBOOLEAN LITERALS:");
        System.out.println(flagTrue + ", " + flagFalse);

        System.out.println("\nNULL LITERAL:");
        System.out.println(empty);

      
       /* System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


        char s = 100;       // decimal literal → 'd'
        char t = '\123';    // octal literal → decimal 83 → 'S'
        char u = '\u0045';  // Unicode literal → 'E'
        char v = 0b01000001;    // binary literal → decimal 11 → vertical tab (non-printable)

        System.out.println(s + " " + (int)t + " " + (int)u + " " + v);*/
    }
}