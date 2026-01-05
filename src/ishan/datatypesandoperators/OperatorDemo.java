package ishan.datatypesandoperators;

import java.util.Scanner;

public class OperatorDemo {

    public static void run(Scanner sc) {
        double a = InputUtil.readDouble(sc, "Enter a: ");
        double b = InputUtil.readDouble(sc, "Enter b: ");

        System.out.println("Arithmetic:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (b != 0 ? a / b : "undefined"));

        int x = (int) a;
        int y = (int) b;

        System.out.println("\nRelational:");
        System.out.println("x > y = " + (x > y));
        System.out.println("x == y = " + (x == y));

        System.out.println("\nLogical:");
        boolean cond = (x > 0 && y > 0);
        System.out.println("x>0 && y>0 = " + cond);

        System.out.println("\nUnary:");
        System.out.println("x++ = " + x++);
        System.out.println("++x = " + ++x);

        System.out.println("\nTernary:");
        String result = x > y ? "x is greater" : "y is greater or equal";
        System.out.println(result);
    }
}
