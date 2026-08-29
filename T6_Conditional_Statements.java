public class T6_Conditional_Statements {

    public static void main(String args[])
    {
        int a=6;
        if (a>0)
            System.out.println("Positive");
        else
            System.err.println("Negative");
        // For a if or else block has only one statement then there is no need to use {}
        if(a!=6)
        {
            System.out.println("Hello");
            System.out.println("Good Morning");
        }
        else if(a!=2)
        {
            System.out.println("Hello");
            System.out.println("Good Evening");
        }
        else
            System.out.println("Bye");

        int b=9;

        // TERNARY OPERATOR
        String c=a>b?"Lesser":"Greater";
        int s=a>b?100:200;
        System.out.println(c);
        System.out.println(s);
    }
    
}
