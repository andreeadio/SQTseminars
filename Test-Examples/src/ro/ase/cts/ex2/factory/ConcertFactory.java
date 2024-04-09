package ro.ase.cts.ex2.factory;

public class ConcertFactory implements ShowFactory{

    @Override
    public Show createShow() {
        return new Concert("Concert", "sala p", "12-03-2024", "pop");
    }
}
