package dipan.datatypenoperators;

public class Arthmetic {
    static void arithmeticDemo() {
        byte a = 10;
        byte b = 20;

        // arithmetic promotes to int
        int sum = a + b;

        double x = 5.5;
        int y = 2;

        double result = x / y;   // implicit promotion to double
        int castBack = (int) result; // explicit cast

        System.out.println("\n-- Arithmetic Demo --");
        System.out.println("byte + byte -> int: " + sum);
        System.out.println("double / int -> double: " + result);
        System.out.println("Casting double -> int: " + castBack);
    }
}
