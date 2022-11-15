package oop.calculator;

import oop.measure.Measure;

public class Calculator {

    public double sum(Measure measure1, Measure measure2) {
        return measure1.getValue() + measure2.getValue();
    }
}
