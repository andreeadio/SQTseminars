package ro.ase.cts.builder;

import com.sun.tools.javac.Main;

class Car {

    //required attributes
    private String brand;
    private String model;
    private String color;
    private int nrDoors;

    //+other optional attributes
    private boolean hasGPS;
    private boolean hasSportMode;

    //PRIVATE constructor with parameter CarBuilder
    private Car(CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.model = carBuilder.model;
        this.color = carBuilder.color;
        this.nrDoors = carBuilder.nrDoors;
        this.hasGPS = carBuilder.hasGPS;
        this.hasSportMode = carBuilder.hasSportMode;
    }


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
    static class CarBuilder{
        //required attributes
        private String brand;
        private String model;
        private String color;
        private int nrDoors;

        //+other optional attributes
        private boolean hasGPS;
        private boolean hasSportMode;


        //constructor with required attributes
        public CarBuilder(String brand, String model, String color, int nrDoors) {
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.nrDoors = nrDoors;
        }

        //methods for setting the optional attributes
        public CarBuilder setGPS(boolean hasGPS) {
            this.hasGPS = hasGPS;
            return this;
        }

        public CarBuilder setSportMode(boolean hasSportMode) {
            this.hasSportMode = hasSportMode;
            return this;
        }


        //build method
        public Car build(){
            return new Car(this);

        }
    }
}



class Main_1 {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder("Audi", "S8", "green", 4).setSportMode(true).setGPS(false).build();
        Car car2 = new Car.CarBuilder("Audi", "A4", "black",2).build();

        System.out.println(car1.toString());
        System.out.println(car2.toString());
    }
}