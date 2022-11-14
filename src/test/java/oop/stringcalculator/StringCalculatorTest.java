package oop.stringcalculator;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class StringCalculatorTest {

    private StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void itShouldReturnZeroWhenEmptyStringGiven() {
        assertEquals(stringCalculator.add(""), 0);
    }

    @Test
    public void itShouldReturnValueWhenSingleNumberGiven() {
        assertEquals(stringCalculator.add("1"), 1);
        assertEquals(stringCalculator.add("12"), 12);
    }

}