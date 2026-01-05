package dipan.datatypenoperators;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Java Core Fundamentals Utility ===");

        User user = new User("Alex", 20);   // Custom class usage
        System.out.println("Loaded user -> " + user.describe());

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Arithmetic & Type Promotion");
            System.out.println("2. Relational, Logical & Ternary");
            System.out.println("3. Unary Operators");
            System.out.println("4. Bitwise Operations");
            System.out.println("5. Arrays & Wrapper Classes");
            System.out.println("6. instanceof Demo");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 :arithmeticDemo();
                case 2 : relationalLogicalDemo(scanner);
                case 3 : unaryDemo();
                case 4 : bitwiseDemo();
                case 5 : arrayWrapperDemo();
                case 6 : instanceOfDemo();
                case 0 : {
                    System.out.println("Goodbye!");
                    return;
                }
                default: System.out.println("Invalid choice.");
            }
        }
    }

    // 1. Arithmetic + promotion + casting
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

    // 2. Relational + logical + ternary
    static void relationalLogicalDemo(Scanner scanner) {
        System.out.println("\n-- Relational & Logical Demo --");
        System.out.print("Enter age: ");

        int age = scanner.nextInt();
        boolean isAdult = age >= 18;
        boolean validRange = age > 0 && age < 120;

        String status = isAdult ? "Adult" : "Minor";

        System.out.println("isAdult: " + isAdult);
        System.out.println("validRange: " + validRange);
        System.out.println("status (ternary): " + status);
    }

    // 3. Unary
    static void unaryDemo() {
        int n = 5;

        System.out.println("\n-- Unary Demo --");
        System.out.println("n: " + n);
        System.out.println("++n (pre): " + ++n);
        System.out.println("n++ (post): " + n++);
        System.out.println("After post increment: " + n);
        System.out.println("!true: " + (!true));
    }

    // 4. Bitwise
    static void bitwiseDemo() {
        int a = 6;   // 110
        int b = 3;   // 011

        System.out.println("\n-- Bitwise Demo --");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));
    }

    // 5. Arrays + wrappers
    static void arrayWrapperDemo() {
        int[] nums = {1, 2, 3};
        Integer wrapper = Integer.valueOf(10);

        System.out.println("\n-- Arrays & Wrapper Demo --");
        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Wrapper value: " + wrapper);
        System.out.println("Auto-unboxed + 5: " + (wrapper + 5));
    }

    // 6. instanceof
    static void instanceOfDemo() {
        String s = "Hello";

        System.out.println("\n-- instanceof Demo --");
        System.out.println("s instanceof String: " + (s instanceof String));

        Object obj = s;
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
    }
}
