package ro.ase.cts.ex2.factory;

public abstract class Show implements IShow {
    private String name;
    private String location;
    private String dateTime;

    public Show(String name, String location, String dateTime) {
        this.name = name;
        this.location = location;
        this.dateTime = dateTime;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public String getDateTime() {
        return dateTime;
    }
}
