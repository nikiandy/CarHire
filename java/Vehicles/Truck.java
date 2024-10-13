package Vehicles;

public class Truck extends MotorVehicle implements Vehicle {
    protected double cargoCapacity;
    protected TrailerType trailerType;

    public double getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public TrailerType getTrailerType() {
        return trailerType;
    }

    public void setTrailerType(TrailerType trailerType) {
        this.trailerType = trailerType;
    }

    @Override
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public String getMakeAndModel() {
        return makeAndModel;
    }

    @Override
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public boolean isAvailableForHire() {
        return availableForHire;
    }

    @Override
    public void setHireStatus(boolean status) {
        availableForHire = status;
    }
}

