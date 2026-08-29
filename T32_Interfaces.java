// T31_InterfaceDemo.java

// ---------------------------------------
// INTERFACE
// ---------------------------------------
interface Vehicle {

    // ---------------------------------------
    // Interface variables
    // ---------------------------------------
    // By default:
    // public static final
    int MAX_SPEED = 120;

    // ---------------------------------------
    // Abstract methods
    // ---------------------------------------
    // By default:
    // public abstract
    void start();

    void stop();
}


// ---------------------------------------
// CLASS IMPLEMENTING INTERFACE
// ---------------------------------------
class Car implements Vehicle {

    // MUST implement all interface methods
    public void start() {
        System.out.println("Car starts with a key");
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    void showSpeedLimit() {
        System.out.println("Max speed is " + MAX_SPEED);
    }
}


// ---------------------------------------
// MAIN CLASS
// ---------------------------------------
public class T32_Interfaces {

    public static void main(String[] args) {

        // Interface reference → Implementing class object
        Vehicle v= new Car();

        v.start();
        v.stop();

        // Accessing interface variable
        System.out.println("Speed limit: " + Vehicle.MAX_SPEED);

        // Downcasting to access class-specific method
        Car c = (Car) v;
        c.showSpeedLimit();
    }
}
