package oop.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public Integer[] calculatePrimeFactors(int value) {
        if (value <= 1) return new Integer[]{};
        List<Integer> primeFactors = new ArrayList<>();
        for (int i = 2; i <= value; i++) {
            if (value % i == 0) primeFactors.add(i);
        }
        return primeFactors.toArray(new Integer[0]);
    }
}
