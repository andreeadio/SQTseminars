package ro.ase.cts.ex2.factory;

public class TeatruFactory implements ShowFactory {
    @Override
    public Show createShow() {
        return new Teatru("Teatru", "loc", "12-04-23", "Johsef");
    }
}
