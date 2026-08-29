class T16_Stat_block {

    // Static variable
    static int number;

    // Static block - runs automatically when class loads
    static {
        System.out.println("Static Block Executed");
        number = 50;  // initializing static variable
    }

    // Static method
    static void showDetails() {
        System.out.println("Inside Static Method");
        System.out.println("Number = " + number);
    }

    // Main method
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Main method started");
        

        // We can access static variable directly
        System.out.println("Accessing static variable: " + number);

        // Calling static method
        T16_Stat_block.showDetails();
        

        /*  Without object, executing the static block and  compulsory need to add exception in main function.
        If want to see output comment out all object lines and execute it */
        Class.forName("T16_Stat_block");

    }
}
