package au.com.workshop.tdd.fizzbuzz;

import static java.lang.String.valueOf;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.defaultIfEmpty;

public class FizzBuzz {
    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final int FIVE = 5;
    private static final int THREE = 3;

    public static String of(int number) {
        if (number <= 0) {
            throw new InvalidException("Invalid number: " + number);
        }
        return defaultIfEmpty(getFizz(number) + getBuzz(number), valueOf(number));
    }

    private static String getBuzz(int number) {
        return number % FIVE == 0 ? BUZZ : EMPTY;
    }

    private static String getFizz(int number) {
        return number % THREE == 0 ? FIZZ : EMPTY;
    }
}
