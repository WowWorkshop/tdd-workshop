package au.com.workshop.tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;
    private static final int THREE = 3;
    private static final int FIVE = 5;

    public String calculate(int number) {
        String result = valueOf(number);

        if (number % THREE == 0) {
            result = FIZZ;
        }

        if (number % FIVE == 0) {
            result = BUZZ;
        }

        if (number % 3 == 0 && number % 5 == 0) {
            result = FIZZ_BUZZ;
        }
        return result;
    }
}
