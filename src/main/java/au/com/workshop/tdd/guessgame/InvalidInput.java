package au.com.workshop.tdd.guessgame;

public class InvalidInput extends RuntimeException {
    public InvalidInput(String number) {
        super("Invalid number: " + number);
    }
}
