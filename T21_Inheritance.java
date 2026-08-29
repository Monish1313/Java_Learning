public class T21_Inheritance {

    // --------------------------------------------------------
    // 1️⃣ SINGLE INHERITANCE
    // --------------------------------------------------------

    // Parent class
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Child class
    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }


    // --------------------------------------------------------
    // 2️⃣ MULTILEVEL INHERITANCE
    // --------------------------------------------------------

    // Grandparent class
    static class Vehicle {
        void start() {
            System.out.println("Vehicle is starting");
        }
    }

    // Parent class
    static class Car extends Vehicle {
        void drive() {
            System.out.println("Car is driving");
        }
    }

    // Child class
    static class SportsCar extends Car {
        void turbo() {
            System.out.println("SportsCar turbo mode ON");
        }
    }


    // --------------------------------------------------------
    // 3️⃣ HIERARCHICAL INHERITANCE
    // --------------------------------------------------------

    // Parent class
    static class Shape {
        void draw() {
            System.out.println("Drawing a shape");
        }
    }

    // Child 1
    static class Circle extends Shape {
        void area() {
            System.out.println("Area of Circle = πr²");
        }
    }

    // Child 2
    static class Rectangle extends Shape {
        void area() {
            System.out.println("Area of Rectangle = length × breadth");
        }
    }


    // --------------------------------------------------------
    // MAIN METHOD - Calling all inheritance types
    // --------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("---------- SINGLE INHERITANCE ----------");
        Dog d = new Dog();
        d.eat();   // from Animal
        d.bark();  // from Dog

        System.out.println("\n---------- MULTILEVEL INHERITANCE ----------");
        SportsCar sc = new SportsCar();
        sc.start();  // from Vehicle
        sc.drive();  // from Car
        sc.turbo();  // from SportsCar

        System.out.println("\n---------- HIERARCHICAL INHERITANCE ----------");
        Circle c = new Circle();
        c.draw();   // from Shape
        c.area();   // Circle method

        Rectangle r = new Rectangle();
        r.draw();   // from Shape
        r.area();   // Rectangle method
    }
}
