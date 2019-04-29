package au.com.workshop.tdd.guessgame;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator implements Generator {

    private final Random random = new Random();

    @Override
    public String generate() {
        Set<Integer> digits = new HashSet<>();
        while (digits.size() < 4) {
            digits.add(random.nextInt(10));
        }
        StringBuilder generated = new StringBuilder();
        for (int digit : digits) {
            generated.append(digit);
        }
        return generated.toString();
    }
}
