package factories;

import customer.Customer;
import customer.CustomerBasicImpl;
import vehicle.VehicleBasicImpl;
import vehicle.Vehicle;

public class BasicFactoryImpl implements AbstractFactoryBasic {
    @Override
    public Customer createCustomer() {
        return new CustomerBasicImpl();
    }

    @Override
    public Vehicle createVehicle() {
        return new VehicleBasicImpl();
    }
}
