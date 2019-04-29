package au.com.workshop.tdd.fizzbuzz;

public class InvalidException extends RuntimeException {
    public InvalidException(int input) {
        super("Invalid number: " + input);
    }
}
