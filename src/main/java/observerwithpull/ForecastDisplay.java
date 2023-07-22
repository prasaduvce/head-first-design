package observerwithpull;

public class ForecastDisplay implements Observer, DisplayElement {

    private float temp;

    private float humidity;

    private float currentPressure = 29.92f;

    private float lastPressure;

    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions : "+temp+" F degrees and "+humidity+" % humidity");
        if (currentPressure == lastPressure) {
            System.out.println("Forecast: More of the same");
        }
        else if (currentPressure > lastPressure) {
            System.out.println("Forecast: Watch out for cooler, rainy weather");
        }
        else if (currentPressure < lastPressure) {
            System.out.println("Forecast: Improving weather on the way");
        }
    }

    @Override
    public void update() {
        this.temp = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        this.lastPressure = weatherData.getPressure();
        display();
    }
}
