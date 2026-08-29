import Packages_Monish.Calc1;
import Packages_Monish.Calc2;

public class T23_Packages {
    public static void main(String[] args) {

        Calc1 c1 = new Calc1();
        Calc2 c2 = new Calc2();

        System.out.println("Add: " + c1.add(10, 20));
        System.out.println("Sub: " + c1.sub(30, 12));
        System.out.println("Mul: " + c2.mul(5, 6));
        System.out.println("Div: " + c2.div(40, 8));
    }
}
