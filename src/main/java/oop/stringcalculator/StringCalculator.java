package oop.stringcalculator;

public class StringCalculator {
    public int add(String input) {
        return input.isEmpty() ? 0 : Integer.parseInt(input);
    }
}
