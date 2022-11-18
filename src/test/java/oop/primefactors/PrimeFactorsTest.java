package oop.primefactors;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class PrimeFactorsTest {

    @DataProvider(name = "data-provider-number-and-factor-list")
    public Object[][] dataProviderNumberAndFactorList() {
        return new Object[][]{
                new Object[]{1, new Integer[]{}},
                new Object[]{2, new Integer[]{2}},
                new Object[]{3, new Integer[]{3}},
                new Object[]{4, new Integer[]{2, 2}},
        };
    }

    @Test(dataProvider = "data-provider-number-and-factor-list")
    public void itShouldReturnThePrimeFactorsInArraySequence(int number, Integer[] expectedFactors) {
        PrimeFactors primeFactors = new PrimeFactors();
        assertEquals(primeFactors.calculatePrimeFactors(number), expectedFactors); //todo: add function to check if a number is prime
    }

}