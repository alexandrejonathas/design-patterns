import control.RemoteControl;
import control.RemoteControlWithVolume;
import device.Radio;
import device.Television;

public class Main {
    public static void main(String[] args) {
        var tvControl = new RemoteControl(new Television("Televisor"));
        tvControl.isPowerOn();

        tvControl.togglePower();

        tvControl.isPowerOn();

        var radioControl = new RemoteControlWithVolume(new Radio("Radio"));
        radioControl.isPowerOn();

        radioControl.volumeUp();
        radioControl.volumeUp();
        radioControl.volumeDown();

        radioControl.togglePower();

    }
}
