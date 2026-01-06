package dipan.datatypenoperators;

public class Unary {
    static void unaryDemo() {
        int n = 5;

        System.out.println("\n-- Unary Demo --");
        System.out.println("n: " + n);
        System.out.println("++n (pre): " + ++n);
        System.out.println("n++ (post): " + n++);
        System.out.println("After post increment: " + n);
        System.out.println("!true: " + (!true));
    }

}
