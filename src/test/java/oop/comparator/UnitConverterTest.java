package oop.comparator;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class UnitConverterTest {

    @Test
    public void itShouldConvertMeterToFeet() {
        assertEquals(UnitConverter.feetToMeter(5.0), 1.524, 0.01);
        assertNotEquals(UnitConverter.feetToMeter(85.70), 85.70, 0.01);
    }

    @Test
    public void itShouldConvertInchesToYards() {
        assertEquals(UnitConverter.inchesToYards(5.0),0.1389,0.01);
        assertNotEquals(UnitConverter.inchesToYards(10.0),0.1389,0.01);
    }

    @Test
    public void itShouldConvertMeterToCentimeter() {
        assertEquals(UnitConverter.metersToCentimeters(2.0),200.0,0.01);
        assertNotEquals(UnitConverter.metersToCentimeters(21.0),200.0,0.01);
    }
}