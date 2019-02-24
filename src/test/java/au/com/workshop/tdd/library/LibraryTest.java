package au.com.workshop.tdd.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {

    @Test
    public void shouldSomeLibraryMethodReturnTrue() {
        assertTrue(new Library().someLibraryMethod(), "someLibraryMethod should return 'true'");
    }

}