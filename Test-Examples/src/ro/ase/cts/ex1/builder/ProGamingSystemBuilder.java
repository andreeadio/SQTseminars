package ro.ase.cts.ex1.builder;

public class ProGamingSystemBuilder implements GamingSystemBuilder{


    private ProGamingSystem pro;

    //package
    ProGamingSystemBuilder()
    {
        this.pro =new ProGamingSystem();
    }
    @Override
    public void buildMemory() {
        this.pro.setMemorieRAM(32);
        this.pro.setSdd(512);
    }

    @Override
    public void buildPlaci() {
        this.pro.setPlacaBaza("Intel i7");
        this.pro.setPlacaVideo("Placa video pro");
    }

    public void buildCasti()
    {
        this.pro.setCasti("Asus");
    }

    public void buildCameraWeb()
    {
        this.pro.setCameraWeb("Hama");
    }
    @Override
    public IGamingSystem getGamingSystem() {
        return this.pro;
    }
}
