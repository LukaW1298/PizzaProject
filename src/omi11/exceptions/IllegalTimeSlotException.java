package omi11.exceptions;


public class IllegalTimeSlotException extends Exception{
    private String message;
    public IllegalTimeSlotException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
