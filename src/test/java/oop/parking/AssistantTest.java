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
        parking = new Parking(2);
    }

    @Test
    public void itShouldParkCar() {
        Assistant assistant = new Assistant(Set.of(parking));
        assertTrue(assistant.park("MAT-001"));
    }

    @Test
    public void itShouldRetrieveCar() {
        Assistant assistant = new Assistant(Set.of(parking));
        assistant.park("MAT-001");
        assertTrue(assistant.retrieve("MAT-001"));
        assertFalse(assistant.retrieve("MAT-002"));
    }

    @Test
    public void itShouldSupportMultipleParkingLots() {
        Assistant assistant = new Assistant(Set.of(parking, new Parking(2)));
        assertEquals(assistant.getParkingSet().size(), 2);
    }

    @Test
    public void itShouldUseMultipleParkingLots() {
        Assistant assistant = new Assistant(Set.of(parking, new Parking(2)));
        assertTrue(assistant.park("MAT-001"));
        assertTrue(assistant.park("MAT-002"));
        assertTrue(assistant.park("MAT-003"));
        assertTrue(assistant.park("MAT-004"));
        assertFalse(assistant.park("MAT-005"));
    }

    @Test
    public void itShouldUse80PercentOfParkinCapacity() {
        Assistant assistant = new Assistant(Set.of(new Parking(5)));
        assertTrue(assistant.park("MAT-001"));
        assertTrue(assistant.park("MAT-002"));
        assertTrue(assistant.park("MAT-003"));
        assertTrue(assistant.park("MAT-004"));
        assertFalse(assistant.park("MAT-005"));
    }



}
