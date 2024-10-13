package FleetManagement;

import Vehicles.MotorVehicle;

public interface FleetActions {
    void updateCarStatus(MotorVehicle vehicle);
    double calculateRentalPrice(MotorVehicle vehicle);
}