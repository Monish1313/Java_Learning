class T9_Loops
{
    public static void main(String args[])
    {
        // FOR LOOP
        for(int i=1;i<5;i++)
        {
            System.out.println("*".repeat(i));
        }

        // WHILE LOOP
        int a=10;
        while(a>0)
        {
            System.out.print(a+" "); // System.out.printf("%d ", a);
            a--;
        }

        // DO WHILE LOOP
        int b=0;
        do
        {
            System.out.print(b+" "); // System.out.printf("%d ", b);
            b--;
        }while(a>0);

    }
}