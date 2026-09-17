package weather;

public class WeatherTracker {
    String currentConditions;
    NotifierFactory weatherNotifiers;

    public WeatherTracker() {
        weatherNotifiers = new NotifierFactory();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        Notifier notifier = weatherNotifiers.createNotifier(this.currentConditions);
        System.out.print(notifier.generateWeatherAlert(this.currentConditions));
    }
}