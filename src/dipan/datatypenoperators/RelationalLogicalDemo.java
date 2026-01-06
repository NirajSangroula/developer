package dipan.datatypenoperators;

import java.util.Scanner;

public class RelationalLogicalDemo {
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
}
