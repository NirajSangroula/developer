package ishan.datatypesandoperators;

public class Address {
    String city;
    int zip;

    public Address(String city, int zip) {
        this.city = city;
        this.zip = zip;
    }

    @Override
    public String toString() {
        return city + " (" + zip + ")";
    }
}
