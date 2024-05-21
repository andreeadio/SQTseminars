package facade;

//facade - implica doar o clasa
// - care ofera o interfata simplificata
//pt un sistem complex de actiuni
//utility: simplify interaction, decoupling systems, layering
//o singura clasa care reprezinta un intreg subsistem/ sistem complex

class HomeTheaterSystem{
    //componente (atribute)
    private Amplifier amplifier;
    private Tuner tuner;
    private DVDPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    //constructor

    public HomeTheaterSystem(Amplifier amplifier, Tuner tuner, DVDPlayer dvdPlayer, Projector projector, TheaterLights lights) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
    }

    //actiuni(metode)
    public void watchMovie(String movie)
    {
        System.out.println("Get ready to watch "+movie);
        tuner.on();
        amplifier.on();
        projector.set(dvd);
        lights.dim(9);
        dvd.play(movie);
    }

    public void endMovie(){

        lights.on();
        amplifier.off();
        tuner.off();
        dvd.stop();
        projector.off();
        System.out.println("Shut down movie theater...");
    }

}

//test in main
class MainTest {
    public static void main(String[] args) {
        HomeTheaterSystem system = new HomeTheaterSystem(new Amplifier(),new Tuner(), new DVDPlayer(), new Projector() ,new  TheaterLights() );
        system.watchMovie("Spiderman 2");
        system.endMovie();
    }
}