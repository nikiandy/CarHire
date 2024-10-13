package Users;

import Vehicles.MotorVehicle;

public class MaintenanceUser extends User implements Maintenance {
    @Override
    public void inspectCar(MotorVehicle vehicle) {
        System.out.println("Car inspection completed");
    }

    @Override
    public void repairCar(MotorVehicle vehicle) {
        System.out.println("Car repaired successfully");
    }

    @Override
    public void updateCarStatus(MotorVehicle vehicle) {
        System.out.println("Car status updated");
    }
}