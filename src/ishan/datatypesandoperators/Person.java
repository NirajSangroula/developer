package ishan.datatypesandoperators;

public class Person {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return name + ", age " + age + ", address " + address;
    }
}
