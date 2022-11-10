package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{


    private List<Sensor> sensors = new ArrayList<>();
    private  List<Integer> readings = new ArrayList<>();

    public void addSensor(Sensor sensor){
        sensors.add(sensor);
    }
    @Override
    public boolean isOn() {
        for (Sensor element: sensors){
            if (element.isOn()){
                return true;
            }
        }
        return false;
    }

    @Override
    public void setOn() {
       for (Sensor element: sensors){
           element.setOn();
       }
    }

    @Override
    public void setOff() {
        for (Sensor element: sensors){
            element.setOff();
        }
    }

    @Override
    public int read() {
        int count = 0;
        int sum = 0;
        for (Sensor element: sensors){
            sum += element.read();
            count++;
        }
        readings.add(sum/count);
        return sum / count;
    }

    public List<Integer> readings(){
        return readings;
    }
}
