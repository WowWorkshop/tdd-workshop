package au.com.workshop.tdd.fizzbuzz;

import static java.lang.String.valueOf;
import static org.apache.commons.lang3.StringUtils.EMPTY;
import static org.apache.commons.lang3.StringUtils.defaultIfEmpty;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final Integer THREE = 3;
    private static final Integer FIVE = 5;

    public String calculate(int number) {
        if (number <= 0) {
            throw new InvalidException();
        }
        return defaultIfEmpty(getFizz(number) + getBuzz(number), valueOf(number));
    }

    private String getFizz(int number) {
        return number % THREE == 0 || valueOf(number).contains(THREE.toString()) ? FIZZ : EMPTY;
    }

    private String getBuzz(int number) {
        return number % FIVE == 0 || valueOf(number).contains(FIVE.toString()) ? BUZZ : EMPTY;
    }
}
