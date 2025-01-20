package src.exceptions;

public class StateValidationException extends RuntimeException {
    public StateValidationException() {
        super("the state not found.");
    };
}
