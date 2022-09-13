public class Main {
    public static void main(String[] args) {
        var vipFactory = new VipFactoryImpl();
        var customer = vipFactory.createCustomer();
        var vehicle = vipFactory.createVehicle();

        customer.printTypeCustomer();
        vehicle.printTypeVehicle();
    }
}
