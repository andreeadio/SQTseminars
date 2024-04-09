package ro.ase.cts.ex1.builder;

public class GamingSystemDirector {
    private GamingSystemBuilder builder;
    //package
    GamingSystemDirector(GamingSystemBuilder builder)
    {
        this.builder=builder;
    }
    public void construct()
    {
        builder.buildMemory();
        builder.buildPlaci();
        if(builder instanceof BasicGamingSystemBuilder)
        {
            ((BasicGamingSystemBuilder) builder).buildMouse("Dragon");
            ((BasicGamingSystemBuilder) builder).buildTastatura("Microsoft");
        }
        else
        {
            ((ProGamingSystemBuilder)builder).buildCasti();
            ((ProGamingSystemBuilder) builder).buildCameraWeb();
        }
    }
    public IGamingSystem getGamingSystem()
    {
        return builder.getGamingSystem();
    }
}
