package omi11.store;

public class Person {

    private String firstName;
    private String lastName;
    private Address address;
    private String phoneNumber;


    //+Person(firstName : String, lastName : String, address Address, phoneNo : String)
    public Person(String firstName, String lastName, Address address, String phoneNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    //Person(firstName : String, lastName : String)
    public Person(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address adress) {
        this.address = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + ";" + this.address + ";" + this.phoneNumber; //TODO If Address is Null don't show it same for phone number.
    }
}