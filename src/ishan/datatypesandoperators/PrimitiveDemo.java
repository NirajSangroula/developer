package ishan.datatypesandoperators;

public class PrimitiveDemo {

    public static void run() {
        byte b = 10;
        short s = 200;
        int i = 50000;
        long l = 1000000000L;

        float f = 3.14f;
        double d = 9.81;

        char c = 'A';
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c + " -> " + (int) c);
        System.out.println("boolean: " + flag);

        int promoted = b + s;
        double mixed = i + d;

        System.out.println("Type promotion (byte + short): " + promoted);
        System.out.println("Type promotion (int + double): " + mixed);
    }
}
