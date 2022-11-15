package oop.comparator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparatorTest {

    @Test
    public void itShouldValidateComparisonGivenMetersAndFeet() {
        assertEquals(Comparator.feetToMeter(5.0), 1.524, 0.01);
        assertNotEquals(Comparator.feetToMeter(85.70), 85.70, 0.01);
    }

    @Test
    public void itShouldValidateComparisonGivenInchesAndYards() {
        assertEquals(Comparator.inchesToYards(5.0),0.1389,0.01);
        assertNotEquals(Comparator.inchesToYards(10.0),0.1765,0.01);
    }
}