package au.com.workshop.tdd.guessgame;

import static org.apache.commons.lang3.StringUtils.isNumeric;

public class GuessGame {

    private final Generator generator;
    private final Comparator comparator;

    public GuessGame(Generator generator, Comparator comparator) {
        this.generator = generator;
        this.comparator = comparator;
    }

    public String guess(String number) {
        if (number.length() != 4 || !isNumeric(number)) {
            throw new InvalidInput(number);
        }
        return comparator.compare(generator.generate(), number);
    }
}
