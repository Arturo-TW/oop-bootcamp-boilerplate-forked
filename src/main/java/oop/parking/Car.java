package oop.parking;

public class Car {
    private final String licenseNumber;
    private final boolean large;
    private final boolean handicapped;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public boolean isLarge() {
        return large;
    }

    public static class Builder {
        private String licenseNumber;
        private boolean large;
        private boolean handicapped;

        public Builder (String licenseNumber, boolean large) {
            this.licenseNumber = licenseNumber;
            this.large = large;
        }

        public Builder handicapped(boolean val) {
            handicapped = val;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    private Car(Builder builder){
        licenseNumber = builder.licenseNumber;
        large = builder.large;
        handicapped = builder.handicapped;
    }
}
