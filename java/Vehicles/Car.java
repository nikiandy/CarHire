package Vehicles;

public class Car extends MotorVehicle implements Vehicle {
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

