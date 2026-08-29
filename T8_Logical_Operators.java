public class T8_Logical_Operators {
    public static void main(String args[])
    {
        int a=10;
        if (a>1 & a<100) //BITWISE AND
            System.out.println("Out1");
        if (a>100 | a<100) // BITWISE OR
            System.out.println("Out2");

    // LOGICAL OPERATORS
    /*  Logical operators also called as short circuited.For Example, An (AND) operation
    returns true when both conditions are true.In bitwise AND, If the first condition is false, 
    it will also check second condition, Whereas in logical AND, If the first condition is false,
    it will skip second condition, and return false */

        if (a>1 && a<100) //LOGICAL AND
            System.out.println("Out1");
        if (a>100 || a<100) // LOGICAL OR
            System.out.println("Out2");
        if(a!=0) // LOGICAL NOT
            System.out.println("Not operation");
    }
}
