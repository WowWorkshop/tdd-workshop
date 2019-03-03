package au.com.workshop.tdd.fizzbuzz;

import static java.lang.String.valueOf;

public class FizzBuzz {
    public String calculate(int number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return valueOf(number);
    }
}
