package ro.ase.cts.sem12.observer;

import java.util.Objects;

interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

interface Observer {
    void upload(float temperature, float humidity, float pressure);
}

class WeatherDisplay implements  Observer {
    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void upload(float temperature, float humidity, float pressure) {
        this.humidity=humidity;
        this.temperature=temperature;
        this.pressure=pressure;
        display();
    }

    private void display(){
        System.out.println("Weather display: "+ temperature + " "+humidity + " " +pressure);

    }
}

class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherStation()
    {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        Objects.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers)
        {
            observers.update(temperature, humidity, pressure);
        }

    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature=temperature;
        this.pressure=pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    //main
    class Main1 {
        public static void main(String[] args) {
            WeatherStation weatherStation = new WeatherStation();
            WeatherDisplay display1 = new WeatherDisplay();
            WeatherDisplay display2 = new WeatherDisplay();

            weatherStation.registerObserver(display1);
            weatherStation.registerObserver(display2);

            weatherStation.setMeasurements(75, 60, 30.4f);
            weatherStation.setMeasurements(80, 65, 29.2f);
        }
    }
}
