package application;

public class StandardSensor implements Sensor{
    private int temperature;

    public StandardSensor(int number) {
        this.temperature = number;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {

    }

    @Override
    public void setOff() {

    }

    @Override
    public int read() {
        return temperature;
    }
}
