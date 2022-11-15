package oop.measure;

public abstract class Measure {

    private double value;

    public Measure(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public abstract Measure add(Measure measure);


}
