package Vehicles;

public interface Vehicle {
    String getRegistrationNumber();
    String getMakeAndModel();
    double getRentalPricePerDay();
    boolean isAvailableForHire();
    void setHireStatus(boolean status);
}
