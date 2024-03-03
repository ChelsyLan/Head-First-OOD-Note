//This display implements the Observer interface so it can get changes from the WeatherData object
//It also implements DisplayElement,because our API is going to require all display elements to implement this interface.
public class CurrentConditionDisplay implements Observer,DisplayElement{
    private double temperature;
    private double pressure;
    private WeatherData weatherData;

    /*
     * @param weatherData:
     * @return null
            * @description constructor
            */
    public CurrentConditionDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        //subject(weather data) registers observer
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("current conditions: "+this.temperature+"C degrees and "+this.pressure);

    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature=temperature;
        this.pressure=pressure;
        display();

    }
}
