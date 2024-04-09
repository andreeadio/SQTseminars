package ro.ase.cts.ex2.factory;

public class StandupComendy extends Show{


    private boolean isLimbajLicentios;

    public StandupComendy(String name, String location, String dateTime, boolean isLimbajLicentios) {
        super(name, location, dateTime);
        this.isLimbajLicentios = isLimbajLicentios;
    }

    @Override
    public void printDetails() {
        System.out.println("Standup");
    }
}
