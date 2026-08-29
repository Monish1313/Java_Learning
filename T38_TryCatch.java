public class T38_TryCatch {

    public static void main(String[] args) {

        try {

            // 1️⃣ ArithmeticException
            int a = 10 / 0;

            // 2️⃣ NullPointerException
            String s = null;
            System.out.println(s.length());

            // 3️⃣ ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);

            // 4️⃣ NumberFormatException
            int num = Integer.parseInt("abc");

        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Cannot divide by zero");
        }
        catch (NullPointerException e) {
            System.out.println("NullPointerException: Object is null");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Invalid array index");
        }
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid number format");
        }
        catch (Exception e) {
            // Main / parent exception block
            // This must ALWAYS be at the end
            System.out.println("General Exception handled");
        }

        System.out.println("Program continues after exception handling");
    }
}
