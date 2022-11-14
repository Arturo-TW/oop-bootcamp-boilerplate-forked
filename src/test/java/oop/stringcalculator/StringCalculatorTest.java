package oop.stringcalculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class StringCalculatorTest {

    @Test
    public void itShouldReturnZeroWhenEmptyStringGiven() {
        final StringCalculator stringCalculator = new StringCalculator();
        final int actualResult = stringCalculator.add("");
        assertEquals(actualResult, 0);
    }

    @Test
    public void itShouldReturnValueWhenSingleNumberGiven() {
        final StringCalculator stringCalculator = new StringCalculator();
        final int actualResult = stringCalculator.add("1");
        assertEquals(actualResult, 1);
    }

}