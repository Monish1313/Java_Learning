// ---------------------------------------
// Abstract Class
// ---------------------------------------
abstract class Vehicle {

    // Abstract method (no body)
    // Child classes MUST implement this
    abstract void start();

    // Normal concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }
}

// ---------------------------------------
// Child Class implements abstract method
// ---------------------------------------
class Car extends Vehicle { // concrete class

    // Providing implementation of abstract method
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {  // concrete class

    void start() {
        System.out.println("Bike starts with a self-start button");
    }
}

// ---------------------------------------
// MAIN CLASS
// ---------------------------------------
public class T29_Abstract {

    public static void main(String[] args) {

        // Vehicle v = new Vehicle(); // ❌ ERROR: Cannot create object of abstract class

        Vehicle car = new Car();  // Upcasting
        car.start();               // Car's implementation
        car.stop();                // Inherited concrete method

        Vehicle bike = new Bike(); // Upcasting
        bike.start();              // Bike's implementation
        bike.stop();               // Inherited method
    }
}
