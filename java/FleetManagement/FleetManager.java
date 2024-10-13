package FleetManagement;

import Vehicles.MotorVehicle;

public interface FleetManager {
    void scheduleMaintenance(MotorVehicle vehicle);
    void addVehicleToInventory(MotorVehicle vehicle);
    void removeVehicleFromInventory(MotorVehicle vehicle);
}