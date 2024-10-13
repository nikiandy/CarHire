package FleetManagement;

import java.util.List;
import Vehicles.MotorVehicle;

public class Fleet implements FleetActions {
    protected List<MotorVehicle> vehicles;
    protected int fleetSize;
    protected List<MotorVehicle> availableCars;
    protected List<MotorVehicle> hiredCars;
    protected double fleetValue;

    public List<MotorVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<MotorVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public int getFleetSize() {
        return fleetSize;
    }

    public void setFleetSize(int fleetSize) {
        this.fleetSize = fleetSize;
    }

    public List<MotorVehicle> getAvailableCars() {
        return availableCars;
    }

    public void setAvailableCars(List<MotorVehicle> availableCars) {
        this.availableCars = availableCars;
    }

    public List<MotorVehicle> getHiredCars() {
        return hiredCars;
    }

    public void setHiredCars(List<MotorVehicle> hiredCars) {
        this.hiredCars = hiredCars;
    }

    public double getFleetValue() {
        return fleetValue;
    }

    public void setFleetValue(double fleetValue) {
        this.fleetValue = fleetValue;
    }

    @Override
    public void updateCarStatus(MotorVehicle vehicle) {
        // Implementation here
    }

    @Override
    public double calculateRentalPrice(MotorVehicle vehicle) {
        // Implementation here
        return 2.0;
    }
}