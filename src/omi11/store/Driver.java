package omi11.store;

public class Driver extends Employee{

    private String licenceNo;

    public Driver(String firstName, String lastName, String licenceNo){
        super(firstName,lastName,2); // empType = DRIVER{2}
        this.licenceNo = licenceNo;
    }


    public String getLicenceNo() {
        return licenceNo;
    }

    public void setLicenceNo(String licenceNo) {
        this.licenceNo = licenceNo;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.licenceNo;
    }
}
