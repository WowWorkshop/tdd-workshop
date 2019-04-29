package au.com.workshop.tdd.guessgame;

import static java.lang.String.format;

public class NumberComparator implements Comparator {
    @Override
    public String compare(String generated, String guessed) {
        int positionCount = 0;
        int digitCount = 0;
        for (int index = 0; index < generated.length(); index++) {
            if (generated.charAt(index) == guessed.charAt(index)) {
                positionCount++;
            }
            if (guessed.indexOf(generated.charAt(index)) != -1) {
                digitCount++;
            }
        }
        return format("%dA%dB", positionCount, digitCount - positionCount);
    }
}
