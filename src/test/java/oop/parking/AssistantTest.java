package oop.parking;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AssistantTest {

  Parking parking;
  Assistant assistant;
  Car car;

  @BeforeMethod
  public void setUp() {
    car = new Car.Builder("MAT-001",false).build();
    parking = new Parking(2);
    assistant = new Assistant(parking);
  }

  @Test
  public void itShouldParkCar() {
    assertTrue(assistant.park(car));
    assertFalse(assistant.park(car));
  }

  @Test
  public void itShouldRetrieveCar() {
    assistant.park(car);
    assertTrue(assistant.retrieve(car));
    assertFalse(assistant.retrieve(car));
  }

  @Test
  public void itShouldParkCarInMultipleParkingLots() {
    Parking parking2 = new Parking(2);
    assistant = new Assistant(parking, parking2);
    assertTrue(assistant.park(new Car.Builder("MAT-001",false).build()));
    assertTrue(assistant.park(new Car.Builder("MAT-002",false).build()));
    assertTrue(assistant.park(new Car.Builder("MAT-003",false).build()));
    assertTrue(assistant.park(new Car.Builder("MAT-004",false).build()));
    assertFalse(assistant.park(new Car.Builder("MAT-005", false).build()));
  }

  @Test
  public void itShouldParkCarLessThanEightyPercentFull() {
    Parking parking = new Parking(10);
    assistant = new Assistant(parking);

    for(int i = 1; i <= 8; i++) {
      var license = "MAT-00" + i;
      assertTrue(assistant.park(new Car.Builder(license,false).build()));
    }
    assertFalse(assistant.park(new Car.Builder("MAT-009", false).build()));
  }


  @Test
  public void itShouldParkLargeCars() {
    Parking parking = new Parking(2);
    Car largeCar = new Car.Builder("MAT-001", true).build();
    Car regularCar = new Car.Builder("MAT-002",false).build();
    Assistant assistant = new Assistant(parking);

    assertTrue(assistant.park(largeCar));
    assertTrue(assistant.park(regularCar));
  }

  @Test
  public void itShouldParkLargeCarsInParkingLotsLeastUsage() {
    Parking parking = new Parking(5);
    Parking parking2 = new Parking(5);

    assistant = new Assistant(parking, parking2);

    assertTrue(assistant.park(new Car.Builder("MAT-001",true).build()));
    assertTrue(assistant.park(new Car.Builder("MAT-002",true).build()));

    assertEquals(parking.availableSpace(), 4);
    assertEquals(parking2.availableSpace(), 4);
  }

  @Test
  public void itShouldParkHandicappedCarsInAccessibleParkingLot() {
    Parking parking = new Parking(5);
    assistant = new Assistant(parking);

    assertFalse(assistant.park(new Car.Builder("MAT-001",true)
            .handicapped(true).build()));

    Parking parking2 = new Parking(5,true);
    assistant = new Assistant(parking2);

    assertTrue(assistant.park(new Car.Builder("MAT-001",true)
            .handicapped(true).build()));
  }
}
