package omi11.store;

public class Cook extends Employee{

    private Float throughput;

    public Cook(String firstName, String lastName, Float throughput){
        super(firstName, lastName, 1); // empType = COOK{1}
        this.throughput = throughput;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + this.throughput;
    }
}
