package dipan.datatypenoperators;

class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String describe() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}

