package factories;

import customer.Customer;
import vehicle.Vehicle;

public interface AbstractFactoryBasic {
    Customer createCustomer();
    Vehicle createVehicle();
}
