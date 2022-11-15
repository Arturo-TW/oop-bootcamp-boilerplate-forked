package oop.comparator;

public class UnitConverter {

    public static final double FEET_TO_METER_FACTOR = 0.3048;
    public static final double INCHES_TO_YARDS_FACTOR = 0.02780;
    public static final double METERS_TO_CENTIMETERS_FACTOR = 100;

    public static double feetToMeter(double feet) {
        return feet * FEET_TO_METER_FACTOR;
    }

    public static double inchesToYards(double inches) {
         return inches * INCHES_TO_YARDS_FACTOR;
    }

    public static double metersToCentimeters(double meters) {
        return  meters * METERS_TO_CENTIMETERS_FACTOR;
    }
}
