package control;

import device.Device;

public class RemoteControlWithVolume extends Control {
    public RemoteControlWithVolume(Device device) {
        super(device);
    }

    public void volumeUp() {
        Integer oldVolume = device.getVolume();
        device.setVolume(oldVolume + 10);
        showVolume(oldVolume);
    }

    public void volumeDown() {
        Integer oldVolume = device.getVolume();
        device.setVolume(oldVolume - 10);
        showVolume(oldVolume);
    }

    private void showVolume(Integer oldVolume) {
        System.out.println("The volume of "+ device.getName() +" was "+ oldVolume + " and now is " +device.getVolume());
    }

}
