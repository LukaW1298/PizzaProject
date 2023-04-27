package omi11.store;

import omi11.exceptions.IllegalEmployeeTypeException;
import omi11.time.TimeSlot;

import javax.swing.*;

public class Employee extends Person { //abstract
    public static final Integer COOK = 1;
    public static final Integer DRIVER = 2;
    private static Integer nextEmployeeNo = 1000;

    private Integer employeeNo;
    private Integer empType;
    private TimeSlot shift;

    protected Employee(String firstName, String lastName, Integer empType) {
        //TODO test constuctor
        super(firstName, lastName);

        try {
            if (empType == COOK || empType == DRIVER) {
                this.empType = empType;
            } else {
                throw new IllegalEmployeeTypeException("ERROR!!! - empType has to be either COOK(1) or DRIVER(2)!\n");
            }

            this.employeeNo = nextEmployeeNo;
            nextEmployeeNo++;

        } catch (IllegalEmployeeTypeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setShift(TimeSlot slot) {
        this.shift = slot;
    }

    public TimeSlot getShift() {
        return shift;
    }

    public Integer getEmployeeNo() {
        return employeeNo;
    }

    public Integer getEmpType() {
        return empType;
    }

    @Override
    public String toString() {
        String empType = (this.empType == COOK) || (this.empType ==  DRIVER) ? "cook" : "driver";
        return empType + " " +  employeeNo + ";" + super.toString();

    }
}


