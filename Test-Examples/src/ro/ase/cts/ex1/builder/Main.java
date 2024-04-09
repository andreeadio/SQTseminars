package ro.ase.cts.ex1.builder;

public class Main {
    public static void main(String[] args) {
        GamingSystemBuilder builder = new BasicGamingSystemBuilder();
        GamingSystemDirector director = new GamingSystemDirector(builder);

        director.construct();
        IGamingSystem basicSystem= (BasicGamingSystem) director.getGamingSystem();
        basicSystem.printConfiguration();

        builder= new ProGamingSystemBuilder();
        director = new GamingSystemDirector(builder);
        director.construct();
        IGamingSystem system = director.getGamingSystem();
        system.printConfiguration();
    }
}
