public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay =
                new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurement(78, 90, 29.2f);
    }
}