import Users.*;
import Vehicles.*;
import Transactions.*;
import FleetManagement.*;

public class Main {
    public static void main(String[] args) {
        // Create a new customer
        Customer customer = new Customer();
        customer.setName("John Doe");
        customer.setLicenseNumber("123456");
        customer.setAge(30);

        // Create a new car
        Car car = new Car();
        car.setRegistrationNumber("ABC123");
        car.setMakeAndModel("Toyota Corolla");
        car.setRentalPricePerDay(50);
        car.setAvailableForHire(true);

        // Add the car to the fleet
        Fleet fleet = new Fleet();
        //fleet.getVehicles().add(car);

        // The customer views available cars
        /*for (MotorVehicle vehicle : fleet.getVehicles()) {
            if (vehicle.isAvailableForHire()) {
                System.out.println(vehicle.getMakeAndModel());
            }
        } */

        // The customer books a car
        Booking booking = new Booking();
        booking.setCustomer(customer);
        booking.setVehicle(car);
        customer.setCurrentBooking(booking);

        // The admin views all bookings
        AdminUser admin = new AdminUser();
        admin.viewAllBookings();

        // The customer returns the car
        customer.returnCar();

        // The admin marks the booking as returned
        admin.manageBookings();

        // The system updates the car status
        //fleet.updateCarStatus();

        // The system calculates the rental price
        //double price = fleet.calculateRentalPrice();

        // The system sends a booking confirmation message
        //System.out.println("Booking confirmed. Total price: " + price);

        // The system sends an invoice to the customer
        Invoice invoice = new Invoice();
        invoice.setBooking(booking);
        //invoice.setTotalPrice(price);
        System.out.println("Invoice sent to customer.");

        // The maintenance staff inspects and repairs the car
        MaintenanceUser maintenance = new MaintenanceUser();
        maintenance.inspectCar(car);
        maintenance.repairCar(car);

        // The maintenance staff updates the car status
        //maintenance.updateCarStatus();

        // The accountant records the transaction
        // The accountant generates a financial report
        // The accountant manages the invoices
        // These functionalities are not implemented in this example
    }
}