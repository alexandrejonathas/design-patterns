package factories;

import customer.Customer;
import vehicle.Vehicle;

public interface AbstractFactory {
    Customer createCustomer();
    Vehicle createVehicle();
}
