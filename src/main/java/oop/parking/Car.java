package oop.parking;

public class Car {
    private final String licenseNumber;
    private final boolean large;
    private final boolean handicapped;

    public Car(String licenseNumber, boolean large, boolean handicapped){
        this.licenseNumber = licenseNumber;
        this.large = large;
        this.handicapped = handicapped;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public boolean isLarge() {
        return large;
    }
}
