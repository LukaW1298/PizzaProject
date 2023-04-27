package omi11.exceptions;


public class IllegalEmployeeTypeException extends Exception{
    private String message;
    public IllegalEmployeeTypeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
