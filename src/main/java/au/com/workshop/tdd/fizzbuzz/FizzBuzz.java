package au.com.workshop.tdd.fizzbuzz;

import static java.lang.String.valueOf;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.defaultIfEmpty;

public class FizzBuzz {
    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final int FIVE = 5;
    private static final int THREE = 3;

    public static String of(int input) {
        if (input <= 0) {
            throw new InvalidException(input);
        }

        String fizz = calculate(input, FIZZ, THREE);
        String buzz = calculate(input, BUZZ, FIVE);

        return defaultIfEmpty(fizz + buzz, valueOf(input));
    }

    private static String calculate(int input, String word, int number) {
        return input % number == 0 || valueOf(input).contains(valueOf(number)) ? word : EMPTY;
    }
}
