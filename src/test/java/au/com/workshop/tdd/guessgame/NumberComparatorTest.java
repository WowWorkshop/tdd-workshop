package au.com.workshop.tdd.guessgame;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberComparatorTest {

    private final Comparator comparator = new NumberComparator();

    @ParameterizedTest(name = "should show {2} given generated number {0} and guessed number {1}")
    @CsvSource({
            "1234, 1234, 4A0B",
            "5678, 5678, 4A0B",
            "1234, 5678, 0A0B",
            "1234, 9876, 0A0B",
            "1234, 4321, 0A4B",
            "5678, 6587, 0A4B",
            "1234, 1324, 2A2B",
            "4321, 1324, 2A2B",
            "1234, 2538, 1A1B",
    })
    void testCompare(String generated, String guessed, String result) {
        assertEquals(result, comparator.compare(generated, guessed));
    }

}