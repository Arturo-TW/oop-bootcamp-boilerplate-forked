package oop.stringcalculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringCalculatorTest {

    @Test
    public void itShouldReturnZeroWhenEmptyStringGiven() {
        final StringCalculator stringCalculator = new StringCalculator();
        final int actualResult = stringCalculator.add("");
        assertEquals(actualResult, 0);
    }

}