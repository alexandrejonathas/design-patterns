package control;

import device.Device;

public abstract class Control {
    protected Device device;

    protected Control(Device device) {
        this.device = device;
    }

    public void togglePower() {
        device.setPowerOn(!device.isPowerOn());
    }

    public void isPowerOn() {
        System.out.println("The "+ device.getName() +" is power on? "+(device.isPowerOn() ? "On" : "Off"));
    }
}
