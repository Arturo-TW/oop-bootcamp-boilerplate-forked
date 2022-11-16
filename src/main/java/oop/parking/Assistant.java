package oop.parking;

public class Assistant  {

  Parking parking;

  public Assistant(Parking parking) {
    this.parking = parking;
  }

  public boolean park(String licenseNumber) {
    return parking.park(licenseNumber);
  }

  public boolean retrieve(String licenseNumber) {
    return parking.retrieve(licenseNumber);
  }
}
