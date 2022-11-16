package oop.parking;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.testng.annotations.Test;

public class AssistantTest {

  Parking parking = new Parking();

  @Test
  public void itShouldParkCar() {
    Assistant assistant = new Assistant(parking);
    assertTrue(assistant.park("MAT-001"));
  }

  @Test
  public void itShouldRetrieveCar() {
    Assistant assistant = new Assistant(parking);
    assertTrue(assistant.retrieve("MAT-001"));
  }

  @Test
  public void itShouldSupportMultipleParkingLots() {
    Set<Parking> parkingLots = new HashSet<>(Arrays.asList(parking, new Parking()));
    Assistant assistant = new Assistant(parkingLots);
    assertEquals(assistant.getParkingLots().size(), 2);

  }


}
