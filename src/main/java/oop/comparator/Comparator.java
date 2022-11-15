package oop.comparator;

public class Comparator {

    public static final double FEET_TO_METER_FACTOR = 0.3048;

    public boolean checkMetersAndFeet(double meters, double feet) {
        return feetToMeter(feet) == meters;
    }

    private double feetToMeter(double feet) {
        return feet * FEET_TO_METER_FACTOR;
    }
}
