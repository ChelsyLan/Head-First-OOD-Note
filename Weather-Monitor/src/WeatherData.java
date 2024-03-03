import java.util.ArrayList;
import java.util.List;

/*create an appthat uses the WeatherData object to update three displays
for current conditions, weather stats, and a forecast.*/
public class WeatherData implements Subject {
    private double temperature;
    private double humidity;
    private double pressure;

    private List<Observer> observers;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    /*
     * This method gets called
     * whenever the weather measurements
     * have been updated
     */
    public void measurementChanged(){
        notifyObservers();

    }

    public void setMeasurement(double temperature,double humidity,double pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementChanged();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }

    }

    //other WeatherData methods
}
