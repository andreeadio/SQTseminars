package ro.ase.cts.builder;

import com.sun.tools.javac.Main;

class Car_1 {

    //required attributes
    private String brand;
    private String model;

    //+other optional attributes
    private String color;
    private int nrDoors;
    private boolean hasGPS;
    private boolean hasSportMode;

    //PRIVATE constructor with parameter CarBuilder
    private Car_1(){}

    //define getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public boolean isHasGPS() {
        return hasGPS;
    }

    public boolean isHasSportMode() {
        return hasSportMode;
    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", nrDoors=" + nrDoors +
                ", hasGPS=" + hasGPS +
                ", hasSportMode=" + hasSportMode +
                '}';
    }
    //nested static class
}
interface Builder {

    public void setColor(String color);
    public void setNrDoors(int nrDoors) ;
    public void setHasGPS(boolean hasGPS);
    public void setHasSportMode(boolean hasSportMode);
    Car_1 getResult();
}
class CarBuilder_1 implements Builder{
    //required attributes
    private String brand;
    private String model;
    private String color;
    private int nrDoors;

    //+other optional attributes
    private boolean hasGPS;
    private boolean hasSportMode;


    //constructor with required attributes
    public CarBuilder_1(String brand, String model) {
        this.brand = brand;
        this.model = model;

    }

    //methods for setting the optional attributes
    public CarBuilder_1 color ( String color)
    {
        this.color=color;
        return this;
    }
    public CarBuilder_1 nrDoors(int nrDoors)
    {
        this.nrDoors=nrDoors;
        return this;
    }

    //build method
    public Car_1 build(){
        return new Car_1(this);

    }


    @Override
    public void setColor(String color) {

    }

    @Override
    public void setNrDoors(int nrDoors) {
        this.nrDoors=nrDoors;

    }

    @Override
    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    @Override
    public void setHasSportMode(boolean hasSportMode) {
        this.hasSportMode = hasSportMode;

    }

    @Override
    public Car_1 getResult() {
        return new Car_1();
    }
}
 class CarBuildDirector {
    private CarBuilder_1 builder;

    public CarBuildDirector(CarBuilder_1 builder) {
        this.builder = builder;
    }

    public Car_1 construct() {
        builder.setColor("Red");
        return builder.getResult();
    }
}

class Main_2{
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("Audi", "S8").color("green")
                .nrDoors(4)
                .setSportMode(true)
                .setGPS(false)
                .build();

        Car car2 = new Car.CarBuilder("Mercedes", "CLE").color("black").build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}


