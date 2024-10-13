package FleetManagement;

import Vehicles.MotorVehicle;

public class FleetManagerUser implements FleetManager {
    @Override
    public void scheduleMaintenance(MotorVehicle vehicle) {
        // Implementation for scheduling maintenance
        System.out.println("Maintenance scheduled for vehicle with registration number: " + vehicle.getRegistrationNumber());
    }

    @Override
    public void addVehicleToInventory(MotorVehicle vehicle) {
        // Implementation for adding a vehicle to the inventory
        System.out.println("Vehicle added to inventory. Registration number: " + vehicle.getRegistrationNumber());
    }

    @Override
    public void removeVehicleFromInventory(MotorVehicle vehicle) {
        // Implementation for removing a vehicle from the inventory
        System.out.println("Vehicle removed from inventory. Registration number: " + vehicle.getRegistrationNumber());
    }
}

