package au.com.workshop.tdd.fizzbuzz;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    void testFizzBuzz(int input, String word) {
        assertEquals(word, FizzBuzz.of(input));
    }

    @ParameterizedTest(name = "should throw exception given invalid number {0}")
    @ValueSource(ints = {0, -2})
    void testInvalidInput(int input) {
        assertThrows(InvalidException.class, () -> FizzBuzz.of(input));
    }

}
