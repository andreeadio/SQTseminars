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
