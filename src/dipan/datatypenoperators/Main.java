package dipan.datatypenoperators;

import java.util.Arrays;
import java.util.Scanner;

import static dipan.datatypenoperators.ArrayWrapperDemo.arrayWrapperDemo;
import static dipan.datatypenoperators.Arthmetic.arithmeticDemo;
import static dipan.datatypenoperators.Bitwise.bitwiseDemo;
import static dipan.datatypenoperators.InstanceDemo.instanceOfDemo;
import static dipan.datatypenoperators.RelationalLogicalDemo.relationalLogicalDemo;
import static dipan.datatypenoperators.Unary.unaryDemo;

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

}
