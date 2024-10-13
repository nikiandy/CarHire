package Transactions;

import java.util.Date;
import Users.Customer;
import Vehicles.MotorVehicle;

public class Booking {
    protected Date startDate;
    protected Date endDate;
    protected Customer customer;
    protected MotorVehicle vehicle;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public MotorVehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(MotorVehicle vehicle) {
        this.vehicle = vehicle;
    }
}