package factories;

import customer.Customer;
import vehicle.Vehicle;

public interface AbstractFactoryVip {
    Customer createCustomer();
    Vehicle createVehicle();
}
