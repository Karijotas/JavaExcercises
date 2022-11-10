package application;

import java.util.Random;

public class TemperatureSensor implements Sensor {

    private boolean isOn;

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setOn() {
        isOn = true;
    }

    @Override
    public void setOff() {
        isOn = false;
    }

    @Override
    public int read() {

        int i = 0;
        if (!isOn) {
            throw new IllegalStateException();
        }
        i = new Random().nextInt(61)-30;
        return i;
    }
}
