package Packages_Monish;
import Packages_Monish2_Protected.Protected;

class sample extends Protected {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    sample() {
        System.out.println("Protected variable c: " + c);
    }
}
public class Calc1{

    public static void main(String[] args) {
        sample calc = new sample();
        
    }
}