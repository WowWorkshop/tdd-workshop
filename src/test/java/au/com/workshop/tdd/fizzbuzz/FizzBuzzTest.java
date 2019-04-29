package au.com.workshop.tdd.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FizzBuzzTest {
    @ParameterizedTest(name = "should return {1} given {0}")
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "79, '79'",
            "3, 'Fizz'",
            "6, 'Fizz'",
            "18, 'Fizz'",
            "13, 'Fizz'",
            "33, 'Fizz'",
            "73, 'Fizz'",
            "5, 'Buzz'",
            "10, 'Buzz'",
            "50, 'Buzz'",
            "25, 'Buzz'",
            "55, 'Buzz'",
            "85, 'Buzz'",
            "15, 'FizzBuzz'",
            "45, 'FizzBuzz'",
            "35, 'FizzBuzz'",
            "53, 'FizzBuzz'",
            "57, 'FizzBuzz'",

    })
    void testFizzBuzz(int number, String result) {
        assertEquals(result, FizzBuzz.of(number));
    }

    @Test
    void shouldThrowInvalidNumberExceptionGivenIllegalNumberZero() {
        assertThrows(InvalidException.class, () -> FizzBuzz.of(0));
    }

    @Test
    void shouldThrowInvalidNumberExceptionGivenIllegalNumberLessThanZero() {
        assertThrows(InvalidException.class, () -> FizzBuzz.of(-2));
    }

}
