


//folosit pentru relatii one to many
//cand modificare unui obiect trebuie anuntata catre celelalte pt ale schimba

import java.util.ArrayList;
import java.util.List;

//interface Subject -> define methods for attach, detach, notify
interface Subject {
    void register(Observer observer);
    void remove(Observer observer);

    void notifyObservers();
}

interface Observer {
    public void update(float temperature);
}

//concrete observer
class WeatherDisplay implements Observer {

    private float temperature;


    @Override
    public void update(float temperature) {
        this.temperature = temperature;
        display();
    }

    private void display()
    {
        System.out.println("Weather Display: "+temperature);

    }
}

//concrete subject
class WeatherStation implements Subject{

    private List<Observer> observerList;
    private float temperature;

    public WeatherStation() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observerList)
        {
            observer.update(temperature);
        }
    }

    public void setMeasurements(float temperature)
    {
        this.temperature=temperature;
        notifyObservers();
    }
}

//testare in main
class Main2{
    public static void main(String[] args) {
        WeatherStation subject = new WeatherStation();

        //observers
        WeatherDisplay display1 = new WeatherDisplay();
        WeatherDisplay display2 = new WeatherDisplay();

        subject.register(display1);
        subject.register(display2);

        subject.setMeasurements(25);
        subject.setMeasurements(15);

    }
}