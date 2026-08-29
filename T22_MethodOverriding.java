// Parent class (superclass)
class Animal {

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class (subclass)
class Dog extends Animal {

    // Overriding the parent method
    @Override
    void sound() {
        System.out.println("Dog barks");   // new behavior
    }
}

public class T22_MethodOverriding {

    public static void main(String[] args) {

        // ------------------------------
        // 1. Parent class reference, parent object
        // ------------------------------
        Animal a1 = new Animal();
        a1.sound();  // Parent version gets called


        // ------------------------------
        // 2. Child class reference, child object
        // ------------------------------
        Dog d = new Dog();
        d.sound();  // Child version gets called


        // ------------------------------
        // 3. Parent reference, child object (Runtime Polymorphism)
        // ------------------------------
        Animal a2 = new Dog();  
        a2.sound();  // Child version gets called (OVERRIDDEN)

         Animal a4 = new Animal();
        a4.sound();
    }
}
