class Maths {
    public int add(int x,int y)
    {
        int r=x+y;
        System.out.println("Success");
        return r;
    }
    
    /* There is a method called "add" with two parameters declared in line 2,
    Using the same method name with different number of parameters is called as method overloading */
    
    public int add(int x,int y,int z) // METHOD OVERLOADING
    {
        int r=x+y+z;
        return r;
    }
}
class T10_Class_Object
{
 public static void main(String args[])
    {
//      class Maths {
//     public int add(int x,int y)
//     {
//         int r=x+y;
//         return r;
//     }
//     public int add(int x,int y,int z)
//     {
//         int r=x+y+z;
//         return r;
//     }
// }


        Maths m1 = new Maths();
        int result = m1.add(5, 10,20);
        System.out.println(result);


        //System.out.println(d);
    }
}


