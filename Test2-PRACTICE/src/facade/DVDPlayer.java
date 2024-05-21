package facade;

public class DVDPlayer {
    public void play(String movie) {
        System.out.println("Play "+movie);
    }

    public void stop() {
        System.out.println("Movie ended");
    }
}
