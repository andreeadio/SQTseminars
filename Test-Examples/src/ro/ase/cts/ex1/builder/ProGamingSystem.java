package ro.ase.cts.ex1.builder;

public class ProGamingSystem implements IGamingSystem{

    private String placaBaza;
    private int memorieRAM;
    private int sdd;
    private String placaVideo;

    //additional
    private String cameraWeb;
    private String casti;

    @Override
    public void printConfiguration() {
        System.out.println("ProGamingSystem{" +
                "placaBaza='" + placaBaza + '\'' +
                ", memorieRAM=" + memorieRAM +
                ", sdd=" + sdd +
                ", placaVideo='" + placaVideo + '\'' +
                ", cameraWeb='" + cameraWeb + '\'' +
                ", caști='" + casti + '\'' +
                '}');
    }

    @Override
    public void setPlacaBaza(String placaBaza) {
        this.placaBaza=placaBaza;
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
        this.placaVideo=placaVideo;
    }

    public void setCameraWeb(String cameraWeb) {
        this.cameraWeb = cameraWeb;
    }

    public void setCasti(String casti) {
        this.casti = casti;
    }

}
