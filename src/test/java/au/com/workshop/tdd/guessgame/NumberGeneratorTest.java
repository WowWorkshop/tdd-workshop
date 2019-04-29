package au.com.workshop.tdd.guessgame;

import org.junit.jupiter.api.Test;

import static java.util.stream.Stream.of;
import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberGeneratorTest {

    private final Generator generator = new NumberGenerator();

    @Test
    void shouldGenerateANumber() {
        assertTrue(isNumeric(generator.generate()));
    }

    @Test
    void shouldGenerateNumberWithLength4() {
        String generated = generator.generate();

        assertEquals(4, generated.length());
    }

    @Test
    void shouldGenerateNumberWithDifferentDigits() {
        String generated = generator.generate();
        long count = generated.chars().distinct().count();

        assertEquals(4, count);
    }

    @Test
    void shouldGenerateNumberRandomly() {
        String first = generator.generate();
        String second = generator.generate();
        String third = generator.generate();

        assertEquals(3, of(first, second, third).distinct().count());
    }

}