package Users;

import Vehicles.MotorVehicle;

public interface Maintenance {
    void inspectCar(MotorVehicle vehicle);
    void repairCar(MotorVehicle vehicle);
    void updateCarStatus(MotorVehicle vehicle);
}