package ro.ase.cts.sem2;

//SOLID principles
//SRP
public class VehicleDB {
    public void addVehicleToDB() {}
}
class VehicleDetails {
    public void printDetails() {

    }
}
class Calculator {
    public double calculateValue()
    {
        return 0;

    }
}

//OCP
interface Vehicle {
    double calculateValue();
}

class Car implements Vehicle{
    @Override
    public double calculateValue() {
        return 0;
    }
}
class Bike implements Vehicle{
    @Override
    public double calculateValue() {
        return 0;
    }
}

//LSP
interface Height {
    void setHeight(double h);
}
interface Width {
    void setWidth(double w);
}
class Rectangle implements Height, Width{
    private double height;
    private double width;
    @Override
    public void setHeight(double h) {
        height=h;
    }
    @Override
    public void setWidth(double w) {
        width=w;
    }
}
class Square implements Height {
    private double length;
    @Override
    public void setHeight(double h) {
        length=h;
    }
}


//sem3
//Interface segregation principle ISP

interface Vehicle1 {
    public void drive();
    public void stop();
    public void refuel();
}

interface Doors{
    public void openDoors();
}

class Bike1 implements Vehicle1{


    @Override
    public void drive() {
        System.out.println("it is driving");
    }

    @Override
    public void stop() {

    }

    @Override
    public void refuel() {

    }
}
interface Engine {

    public void start();

}

class Car1 {
    private Engine engine;
    public Car1(Engine e)
    {
        engine=e;
    }
    public void start()
    {
        engine.start();
    }

}

class PetrolEngine implements Engine{

    @Override
    public void start() {

    }
}

class DieselEngine implements Engine{

    @Override
    public void start() {

    }
}












