package oop.chance;

import java.text.DecimalFormat;

public class Chance {

    int value;
    DecimalFormat rounded = new DecimalFormat("#");

    public Chance(final int value) {
        this.value = value;
    }

    public double chancesOfAnEventHappening() {
        return Double.parseDouble(Double.toString(1.0 / value));
    }

    public double chancesOfAnEventNotHappening() {
        return (Double.parseDouble(Double.toString(1.0 - chancesOfAnEventHappening())));
    }

    public Chance calculateProduct(Chance chance) {
        int newValue = (int) Math.round(1 / (chancesOfAnEventHappening() * chance.chancesOfAnEventHappening()));
        System.out.println((int) Math.round(1 / (chancesOfAnEventHappening() * chance.chancesOfAnEventHappening())));
        return new Chance(newValue);
    }
}
