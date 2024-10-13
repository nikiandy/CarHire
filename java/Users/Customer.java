package Users;

import Transactions.Booking;

public class Customer extends User implements UserActions {
    protected String name;
    protected String licenseNumber;
    protected int age;
    protected Booking currentBooking;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Booking getCurrentBooking() {
        return currentBooking;
    }

    public void setCurrentBooking(Booking currentBooking) {
        this.currentBooking = currentBooking;
    }

    @Override
    public void bookCar() {
        System.out.println("Car booked successfully");
    }

    @Override
    public void returnCar() {
        System.out.println("Car returned successfully");
    }

    @Override
    public void extendBooking() {
        System.out.println("Booking extended successfully");
    }
}