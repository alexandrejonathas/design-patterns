public class VipFactoryImpl implements AbstractFactoryVip {
    @Override
    public CustomerVip createCustomer() {
        return new CustomerVipImpl();
    }

    @Override
    public LuxVehicle createVehicle() {
        return new LuxVehicleImpl();
    }
}
