package dipan.datatypenoperators;

public class Bitwise {
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
}
