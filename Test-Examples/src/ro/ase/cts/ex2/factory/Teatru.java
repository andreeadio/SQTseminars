package ro.ase.cts.ex2.factory;

public class Teatru extends Show{

    private String name;
    private String location;
    private String dateTime;

    private String director;

    public Teatru(String name, String location, String dateTime, String director) {
        super(name, location, dateTime);
        this.director = director;
    }

    @Override
    public void printDetails() {
        System.out.println("Teatru");
    }

}
