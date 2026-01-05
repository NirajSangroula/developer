package ishan.datatypesandoperators;

import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean showMenu = true;

        while (showMenu) {

            // Show menu FIRST time or after user says YES
            System.out.println("\n==== Java Fundamentals Utility ====");
            System.out.println("1. Primitives & Type Promotion");
            System.out.println("2. Arithmetic / Relational / Logical / Unary / Ternary");
            System.out.println("3. Bitwise Operators");
            System.out.println("4. Casting & Wrapper Classes");
            System.out.println("5. Strings & Arrays");
            System.out.println("6. Custom Classes & instanceof");
            System.out.println("0. Exit this program");

            int choice = InputUtil.readInt(sc, "Choose option: ");

            if (choice == 0) {
                System.out.println("Exiting program.");
                break;
            }

            switch (choice) {
                case 1:
                    PrimitiveDemo.run();
                    break;
                case 2:
                    OperatorDemo.run(sc);
                    break;
                case 3:
                    BitwiseDemo.run(sc);
                    break;
                case 4:
                    CastingAndWrapperDemo.run(sc);
                    break;
                case 5:
                    StringAndArrayDemo.run();
                    break;
                case 6:
                    CustomClassDemo.run();
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            // Ask rerun question AFTER execution
            System.out.print("\nDo you want to re-run the program? (yes/no): ");
            sc.nextLine(); // consume leftover newline
            String answer = sc.nextLine().trim().toLowerCase();

            if (!answer.equals("yes")) {
                System.out.println("Program terminated.");
                showMenu = false;
            }
        }

        sc.close();
    }
}
