package factories;

import customer.Customer;
import customer.CustomerVipImpl;
import vehicle.VehicleVipImpl;
import vehicle.Vehicle;

public class VipFactoryImpl implements AbstractFactoryVip {
    @Override
    public Customer createCustomer() {
        return new CustomerVipImpl();
    }

    @Override
    public Vehicle createVehicle() {
        return new VehicleVipImpl();
    }
}
