package dipan.datatypenoperators;

public class InstanceDemo {
    static void instanceOfDemo() {
        String s = "Hello";

        System.out.println("\n-- instanceof Demo --");
        System.out.println("s instanceof String: " + (s instanceof String));

        Object obj = s;
        System.out.println("obj instanceof String: " + (obj instanceof String));
        System.out.println("obj instanceof Object: " + (obj instanceof Object));
    }
}
