package Transactions;

import java.util.List;
import Vehicles.MotorVehicle;

public class Discount {
    protected double discountAmount;
    protected List<MotorVehicle> discountedCars;

    public double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public List<MotorVehicle> getDiscountedCars() {
        return discountedCars;
    }

    public void setDiscountedCars(List<MotorVehicle> discountedCars) {
        this.discountedCars = discountedCars;
    }
}