package util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DniLetterCalculatorTest {
    @Test
    void testCalculateDniLetter() {
        DniLetterCalculator calculator = new DniLetterCalculator();
        String letter = calculator.calculateDniLetter(12345678);
        assertEquals("Z", letter);

    }
}
