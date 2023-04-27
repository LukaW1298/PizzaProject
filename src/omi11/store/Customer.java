package omi11.store;

public class Customer extends Person{
    private static Integer nextCustomerNo = 10000;

    private Integer customerNo;
    private Boolean vip;

    public Customer(String firstName, String lastName, Address adress, String phoneNumber,Boolean vip) {
        super(firstName,lastName,adress,phoneNumber);
        this.vip = vip;
        this.customerNo = nextCustomerNo;
        nextCustomerNo++;
    }

    public Integer getCustomerNo() {
        return customerNo;
    }

    public void setVip(Boolean isVip) {
        this.vip = isVip;
    }

    public Boolean isVip() {
        return this.isVip();
    }

    @Override
    public String toString() {
        return "Customer: " + this.customerNo + ";" + super.toString();
    }


}
