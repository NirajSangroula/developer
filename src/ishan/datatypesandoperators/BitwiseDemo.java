package ishan.datatypesandoperators;

import java.util.Scanner;

public class BitwiseDemo {

    public static void run(Scanner sc) {
        int a = InputUtil.readInt(sc, "Enter int a: ");
        int b = InputUtil.readInt(sc, "Enter int b: ");

        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a << 2 = " + (a << 2));
        System.out.println("a >> 2 = " + (a >> 2));
    }
}
