package device;

public interface Device {
    String getName();

    boolean isPowerOn();
    void setPowerOn(boolean powerOn);

    Integer getVolume();
    void setVolume(Integer volume);

    Integer getChannel();
    void setChannel(Integer channel);
}
