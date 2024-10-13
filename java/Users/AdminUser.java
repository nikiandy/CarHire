package Users;

public class AdminUser extends User implements Admin, UserActions {
    @Override
    public void addCar() {
        System.out.println("Car added successfully");
    }

    @Override
    public void removeCar() {
        System.out.println("Car removed successfully");
    }

    @Override
    public void viewAllBookings() {
        System.out.println("List of all bookings:");
    }

    public void manageBookings() {
        System.out.println("Booking management interface");
    }

    public void bookCar() {
        // Implementation here
    }

    @Override
    public void returnCar() {
        // Implementation here
    }

    @Override
    public void extendBooking() {
        // Implementation here
    }
}