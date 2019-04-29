package au.com.workshop.tdd.guessgame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GuessGameTest {

    private GuessGame guessGame;
    private Generator generator;
    private Comparator comparator;

    @BeforeEach
    void setUp() {
        generator = mock(NumberGenerator.class);
        comparator = mock(NumberComparator.class);
        guessGame = new GuessGame(generator, comparator);
    }

    @Test
    void shouldGuessSuccessfullyWhenGuessedMatchesGenerated() {
        String generated = "1234";
        String guessed = "1234";
        String expected = "4A0B";
        when(generator.generate()).thenReturn(generated);
        when(comparator.compare(generated, guessed)).thenReturn(expected);

        String result = guessGame.guess(guessed);

        assertEquals(expected, result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"123", "12345", "abcd", "12.35"})
    void testInvalidInput(String input) {
        assertThrows(InvalidInput.class, () -> guessGame.guess(input));
    }
}