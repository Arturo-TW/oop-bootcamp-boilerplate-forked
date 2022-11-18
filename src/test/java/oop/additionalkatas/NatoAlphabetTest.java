package oop.additionalkatas;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NatoAlphabetTest {

    @Test
    public void itShouldEncodeMessage() {
        assertEquals(NatoAlphabet.encode("hello"), "hotel-echo-lima-lima-oscar");
    }

    @Test
    public void itShouldDecodeMessage() {
        assertEquals(NatoAlphabet.decode("hotel-echo-lima-lima-oscar"), "hello");
    }

    @Test
    public void itShouldSubstituteWhitespacesWithNull() {
        assertEquals(NatoAlphabet.encode("khabib nurmagomedov"),
                "kilo-hotel-alpha-bravo-india-bravo-null-november-uniform-romeo-mike-alpha-golf-oscar-mike-echo-delta-oscar-victor");
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Input outside NATO alphabet")
    public void itShouldThrowExceptionEmptyInput() {
        NatoAlphabet.encode("");
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Input outside NATO alphabet")
    public void itShouldThrowExceptionInvalidInput() {
        NatoAlphabet.encode("#");
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Input outside NATO alphabet")
    public void itShouldThrowExceptionInvalidMessageToDecode() {
        NatoAlphabet.decode("#");
    }

}
