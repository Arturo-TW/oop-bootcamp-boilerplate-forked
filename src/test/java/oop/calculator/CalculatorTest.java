package oop.calculator;

import oop.measure.Measure;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void itShouldSumTwoValues() {
        Measure inches1 = new Measure(2);
        Measure inches2 = new Measure(2);
        Calculator calculator = new Calculator();
        assertEquals(calculator.sum(inches1, inches2), 4);
    }

//    @Test
//    public void itShouldAddInches() {
//        final Measure inch1 = new Inch(3);
//        final Measure inch2 = new Inch(4);
//        final Measure inchResult = inch1.add(inch2);
//        assertEquals(inchResult, new Inch(7));
//    }
}