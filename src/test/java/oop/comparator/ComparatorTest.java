package oop.comparator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComparatorTest {

    @Test
    public void itShouldCheckIfComparisonIsTrueGivenProperMetersAndFeet() {
        Comparator comparator = new Comparator();
        assertTrue(comparator.checkMetersAndFeet(1.524, 5.0));
    }

    @Test
    public void itShouldCheckIfComparisonIsFalseGivenDistinctMetersAndFeet() {
        Comparator comparator = new Comparator();
        assertFalse(comparator.checkMetersAndFeet(2.355, 85.70));
    }

}