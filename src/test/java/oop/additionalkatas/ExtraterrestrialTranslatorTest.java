package oop.additionalkatas;

import org.testng.annotations.Test;

import static oop.additionalkatas.ExtraterrestrialTranslator.Languages.SPANISH;
import static org.testng.Assert.assertEquals;

public class ExtraterrestrialTranslatorTest {

    @Test
    public void itShouldTranslateHolaToMartian() {
        assertEquals(ExtraterrestrialTranslator.translateSpanishToMartian("hola", SPANISH), "$₳ludo$");
    }

    @Test
    public void itShouldTranslateAdiosToMartian() {
        assertEquals(ExtraterrestrialTranslator.translateSpanishToMartian("adios", SPANISH), "h₳$₸₳ ₽ro₪₸o");
    }

    @Test
    public void itShouldTranslateSentenceToMartian() {
        assertEquals(ExtraterrestrialTranslator.translateSpanishToMartian("hola, espero que lo esteis pasando bien, " +
                "adios", SPANISH), "$₳ludo$, €$₽€ro qu€ lo €$₸€i$ ₽₳$₳₪do bi€₪, h₳$₸₳ ₽ro₪₸o");
    }
}
