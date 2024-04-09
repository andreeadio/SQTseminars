package ro.ase.cts.ex1.builder;

public class BasicGamingSystem implements IGamingSystem{

    private String placaBaza;
    private int memorieRAM;
    private int sdd;
    private String placaVideo;

    //aditional
    private String tastatura;
    private String mouse;


    @Override
    public void setPlacaBaza(String placaBaza) {
        this.placaBaza = placaBaza;
    }

    @Override
    public void setMemorieRAM(int memorieRAM) {
        this.memorieRAM=memorieRAM;
    }

    @Override
    public void setSdd(int sdd) {
        this.sdd=sdd;
    }

    @Override
    public void setPlacaVideo(String placaVideo) {
        this.placaVideo = placaVideo;
    }

    public void setTastatura(String tastatura) {
        this.tastatura = tastatura;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    @Override
    public void printConfiguration() {
        System.out.println( "BasicGamingSystem{" +
                "placaBaza='" + placaBaza + '\'' +
                ", memorieRAM=" + memorieRAM +
                ", sdd=" + sdd +
                ", placaVideo='" + placaVideo + '\'' +
                ", tastatura='" + tastatura + '\'' +
                ", mouse='" + mouse + '\'' +
                '}');
    }


}
