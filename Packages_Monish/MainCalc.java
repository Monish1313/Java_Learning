package Packages_Monish;

public class MainCalc {
    public static void main(String[] args) {

        Calc1 c1 = new Calc1();
        System.out.println("Addition: " + c1.add(10, 20));
        System.out.println("Subtraction: " + c1.sub(50, 25));
        c1.accessProtected();
    }
}
