// T33_AnonymousAbstractDemo.java

abstract class Vehicle {
    
    abstract void start();  // abstract method

    void stop() {           // normal method
        System.out.println("Vehicle stopped");
    }
}

public class T31_AnonymousInnerClass_WithAbstract {
    public static void main(String[] args) {
        
        // Anonymous Inner Class extending abstract class
        Vehicle car = new Vehicle() {
            void start() {
                System.out.println("Car starts with a push button");
            }
        };

        car.start();  // overridden method
        car.stop();   // inherited normal method
    }
}
