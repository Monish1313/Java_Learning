public class T5_Operators {

    public static void main(String[] args) {

        System.out.println("===== ASSIGNMENT OPERATORS =====");
        int a = 10, b = 5;

        a += 5;   // 15
        a -= 2;   // 13
        a *= 2;   // 26
        a /= 2;   // 13
        a %= 3;   // 1

        System.out.println("a after += -= *= /= %= : " + a);


        System.out.println("\n===== RELATIONAL OPERATORS =====");
        int x = 10, y = 20;

        System.out.println("x == y : " + (x == y));  // false
        System.out.println("x != y : " + (x != y));  // true
        System.out.println("x > y  : " + (x > y));   // false
        System.out.println("x < y  : " + (x < y));   // true
        System.out.println("x >= y : " + (x >= y));  // false
        System.out.println("x <= y : " + (x <= y));  // true


        System.out.println("\n===== LOGICAL OPERATORS =====");
        boolean p = true;
        boolean q = false;

        System.out.println("p && q (AND)  : " + (p && q));  // false
        System.out.println("p || q (OR)   : " + (p || q));  // true
        System.out.println("!p   (NOT)    : " + (!p));      // false


        System.out.println("\n===== BITWISE LOGICAL OPERATORS =====");
        int m = 6, n = 3; // 6=0110, 3=0011

        System.out.println("m & n : " + (m & n));   // AND → 2
        System.out.println("m | n : " + (m | n));   // OR  → 7
        System.out.println("m ^ n : " + (m ^ n));   // XOR → 5
        System.out.println("~m    : " + (~m));      // NOT → -7


        System.out.println("\n===== SHIFT OPERATORS =====");
        int s = 8; // 1000

        System.out.println("s << 1   : " + (s << 1));   // 16
        System.out.println("s >> 1   : " + (s >> 1));   // 4
        System.out.println("s >>> 1  : " + (s >>> 1));  // 4 (unsigned)
    }
}
