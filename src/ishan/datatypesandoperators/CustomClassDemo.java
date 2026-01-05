package ishan.datatypesandoperators;

public class CustomClassDemo {

    public static void run() {
        Address addr = new Address("Mississauga", 12345);
        Person p = new Person("Ishan", 21, addr);

        Object obj = p;

        System.out.println(p);
        System.out.println("obj instanceof Person: " + (obj instanceof Person));
        System.out.println("obj instanceof Address: " + (obj instanceof Address));
    }
}
