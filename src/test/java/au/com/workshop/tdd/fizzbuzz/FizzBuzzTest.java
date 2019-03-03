package au.com.workshop.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String FIZZ_BUZZ = FIZZ + BUZZ;
    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnItselfGivenNumberCannotBeDivedByThreeOrFive() {
        assertEquals("1", fizzBuzz.calculate(1));
        assertEquals("2", fizzBuzz.calculate(2));
        assertEquals("11", fizzBuzz.calculate(11));
    }

    @Test
    void shouldReturnFizzGivenNumberCanBeDividedByThree() {
        assertEquals(FIZZ, fizzBuzz.calculate(3));
        assertEquals(FIZZ, fizzBuzz.calculate(6));
        assertEquals(FIZZ, fizzBuzz.calculate(12));
    }

    @Test
    void shouldReturnFizzGivenNumberHasThreeInIt() {
        assertEquals(FIZZ, fizzBuzz.calculate(13));
        assertEquals(FIZZ, fizzBuzz.calculate(33));
        assertEquals(FIZZ, fizzBuzz.calculate(73));
    }

    @Test
    void shouldReturnBuzzGiveNumberCanBeDividedByFive() {
        assertEquals(BUZZ, fizzBuzz.calculate(5));
        assertEquals(BUZZ, fizzBuzz.calculate(10));
        assertEquals(BUZZ, fizzBuzz.calculate(20));
    }

    @Test
    void shouldReturnBuzzGiveNumberHasFiveInIt() {
        assertEquals(BUZZ, fizzBuzz.calculate(25));
        assertEquals(BUZZ, fizzBuzz.calculate(55));
        assertEquals(BUZZ, fizzBuzz.calculate(85));
    }

    @Test
    void shouldReturnFizzBuzzGivenNumberCanBeDividedByBothThreeAndFive() {
        assertEquals(FIZZ_BUZZ, fizzBuzz.calculate(15));
        assertEquals(FIZZ_BUZZ, fizzBuzz.calculate(30));
        assertEquals(FIZZ_BUZZ, fizzBuzz.calculate(45));
    }

    @Test
    void shouldThrowInvalidNumberExceptionGivenIllegalNumberZero() {
        assertThrows(InvalidException.class, () -> fizzBuzz.calculate(0));
    }

    @Test
    void shouldThrowInvalidNumberExceptionGivenIllegalNumberLessThanZero() {
        assertThrows(InvalidException.class, () -> fizzBuzz.calculate(-2));
    }

}
