package ro.ase.cts.ex2.factory;

public class Concert extends Show{
    private String name;
    private String location;
    private String dateTime;

    private String musicGenre;
    public Concert(String name, String location,
                   String dateTime,
                   String musicGenre) {
        super(name, location, dateTime);
        this.musicGenre = musicGenre;

    }

    @Override
    public void printDetails() {
        System.out.println("Concert");
    }


}
