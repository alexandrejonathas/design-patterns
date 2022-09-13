public class BasicFactoryImpl implements AbstractFactoryBasic {
    @Override
    public CustomerBasic createCustomer() {
        return new CustomerBasicImpl();
    }

    @Override
    public BasicVehicle createVehicle() {
        return new BasicVehicleImpl();
    }
}
