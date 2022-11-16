package oop.parking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AssistantTest {

    Parking parking;

    @BeforeMethod
    public void setUp() {
        parking = new Parking();
    }

    @Test
    public void itShouldParkCar() {
        Assistant assistant = new Assistant(new HashSet<>(Arrays.asList(parking)));
        assertTrue(assistant.park("MAT-001"));
    }

    @Test
    public void itShouldRetrieveCar() {
        Assistant assistant = new Assistant(new HashSet<>(Arrays.asList(parking)));
        assistant.park("MAT-001");
        assertTrue(assistant.retrieve("MAT-001"));
        assertFalse(assistant.retrieve("MAT-002"));
    }

    @Test
    public void itShouldSupportMultipleParkingLots() {
        Assistant assistant = new Assistant(Set.of(parking, new Parking()));
        assertEquals(assistant.getParkingSet().size(), 2);
    }


}
