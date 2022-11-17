package oop.parking;

import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.*;

public class ParkingLandlordTest {


    @Test
    public void itShouldNotifyToBuMoreLand() {
        Parking parking = new Parking(4);
        Assistant assistant = new Assistant(Set.of(parking));
        ParkingLandlord parkingLandlord = new ParkingLandlord();

        assertTrue(assistant.park("MAT-001"));
        assertTrue(assistant.park("MAT-002"));
        assertTrue(assistant.park("MAT-003"));
        assertTrue(parkingLandlord.needToBuyMoreLand(parking));
    }
}