package au.com.workshop.tdd.fizzbuzz;

import org.apache.commons.lang3.StringUtils;

import static java.lang.String.valueOf;
import static org.apache.commons.lang3.StringUtils.EMPTY;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;
    private static final int THREE = 3;
    private static final int FIVE = 5;

    public String calculate(int number) {
        String result;

        result = getFizz(number);

        if (number % FIVE == 0) {
            result = BUZZ;
        }

        if (number % 3 == 0 && number % 5 == 0) {
            result = FIZZ_BUZZ;
        }

        return StringUtils.defaultIfEmpty(result, valueOf(number));
    }

    private String getFizz(int number) {
        return number % THREE == 0 ? FIZZ : EMPTY;
    }
}
