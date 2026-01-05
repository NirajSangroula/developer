package datatypesandoperators;

import java.util.Scanner;

public class InputUtil {

    public static int readInt(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            sc.next();
            System.out.print("Enter valid integer: ");
        }
        return sc.nextInt();
    }

    public static double readDouble(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextDouble()) {
            sc.next();
            System.out.print("Enter valid number: ");
        }
        return sc.nextDouble();
    }
}
