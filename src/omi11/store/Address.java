package omi11.store;

public class Address {
    private String street;

    //Konstruktor
    public Address(String street) {
        this.street = street;
    }

    public String getStreetName() {
        return street;
    }

    public void setStreetName(String street) {
        this.street = street;
    }

    public String toString(){
        return street;
    }
}
