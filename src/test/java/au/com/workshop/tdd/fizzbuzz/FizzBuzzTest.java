package au.com.workshop.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnItselfGivenNumberCannotBeDivedByThreeOrFive() {
        assertEquals("1", fizzBuzz.calculate(1));
        assertEquals("2", fizzBuzz.calculate(2));
        assertEquals("11", fizzBuzz.calculate(11));
    }
}
