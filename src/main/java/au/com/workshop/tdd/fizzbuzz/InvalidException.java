package au.com.workshop.tdd.fizzbuzz;

public class InvalidException extends RuntimeException {
    public InvalidException(String message) {
        super(message);
    }
}
