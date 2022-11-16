package oop.parking;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParkingLotTest {

    @Test
    public void itShouldParkACar(){
        Car car = new Car();
        ParkingLot parking = new ParkingLot();
        parking.park(car);
        assertEquals(car.isParked(), true);
    }
}
