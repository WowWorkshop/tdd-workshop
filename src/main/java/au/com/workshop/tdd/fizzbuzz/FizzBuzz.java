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

        String fizz = calculate(number, FIZZ, THREE);
        String buzz = calculate(number, BUZZ, FIVE);

        return defaultIfEmpty(fizz + buzz, valueOf(number));
    }

    private static String calculate(int input, String word, int number) {
        return input % number == 0 || valueOf(input).contains(valueOf(number)) ? word : EMPTY;
    }
}
