package util;

import org.springframework.stereotype.Component;

@Component
public class DniLetterCalculator {

    private static final String[] LETTERS = {
            "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
            "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"
    };

    public String calculateDniLetter(int dniNumber) {
        int remainder = dniNumber % 23;
        return LETTERS[remainder];
    }
}
