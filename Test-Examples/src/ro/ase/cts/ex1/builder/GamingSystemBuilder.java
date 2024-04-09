package ro.ase.cts.ex1.builder;

public interface GamingSystemBuilder {
     void buildMemory();
     void buildPlaci();

    public IGamingSystem getGamingSystem(); //get result
}
