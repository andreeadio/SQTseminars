package ro.ase.cts.ex2.factory;

public class StandupComedyFactory implements ShowFactory{
    @Override
    public Show createShow() {
        return new StandupComendy("Standup", "sala p", "04-03-24", true);

    }
}
