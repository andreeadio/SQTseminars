package ro.ase.cts.ex1.builder;

public class BasicGamingSystemBuilder implements GamingSystemBuilder{

    private BasicGamingSystem basic;

    //package constructor
    BasicGamingSystemBuilder()
    {
        this.basic = new BasicGamingSystem();
    }
    @Override
    public void buildMemory() {
        this.basic.setMemorieRAM(16);
        this.basic.setSdd(256);
    }

    @Override
    public void buildPlaci() {
        this.basic.setPlacaBaza( "Intel i5" );
        this.basic.setPlacaVideo("Video Basic");
    }

    public void buildTastatura(String tastatura)
    {
        this.basic.setTastatura(tastatura);
    }
    public void buildMouse(String mouse)
    {
        this.basic.setMouse(mouse);
    }
    @Override
    public IGamingSystem getGamingSystem() {
        return this.basic;
    }
}
