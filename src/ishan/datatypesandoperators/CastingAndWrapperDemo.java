package ishan.datatypesandoperators;

import java.util.Scanner;

public class CastingAndWrapperDemo {

    public static void run(Scanner sc) {
        double d = InputUtil.readDouble(sc, "Enter double: ");
        int i = (int) d;

        System.out.println("Explicit cast double -> int: " + i);

        Integer boxed = i;
        int unboxed = boxed;

        System.out.println("Autoboxing: " + boxed);
        System.out.println("Unboxing: " + unboxed);

        String num = "123";
        int parsed = Integer.parseInt(num);
        System.out.println("Parsed String \"123\" -> " + parsed);
    }
}
