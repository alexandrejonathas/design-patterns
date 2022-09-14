package device;

public class Television implements Device {

    private String name;
    private boolean powerOn;
    private Integer volume;
    private Integer channel;

    public Television(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isPowerOn() {
        return powerOn;
    }

    @Override
    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    @Override
    public Integer getChannel() {
        return channel;
    }

    @Override
    public void setChannel(Integer channel) {
        this.channel = channel;
    }
}
