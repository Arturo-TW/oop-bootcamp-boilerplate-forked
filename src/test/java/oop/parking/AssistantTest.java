package oop.parking;

import static org.testng.Assert.assertTrue;

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


}
