package ro.ase.cts.facade;


import static java.lang.System.out;

class HomeTheaterFacade{
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    HomeTheaterFacade(Amplifier amp,Tuner tuner,
                      DvdPlayer dvd,
                      Projector projector,
                      TheaterLights lights)
    {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }

    void watchMovie(String movie)
    {
        out.println("Get ready to watch a movie...");
        lights.dim( 10) ;
        projector.on();
        projector.setInput(dvd) ;
        projector.wideScreenMode() ;
        amp.on();
        amp.setDvd(dvd) ;
        amp.setSurroundSound() ;
        amp.setVolume(5) ;
        dvd.on();
        dvd.play( movie );
    }
    void endMovie() {
        out.println("Shut movie theater down...");
        lights.on();
        amp.off();
        projector.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }


}


class Example1{
    public static void main(String[] args)
    {
        HomeTheaterFacade homeTheater= new HomeTheaterFacade(new Amplifier(),new Tuner(),
                new DvdPlayer(), new Projector(), new TheaterLights());
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie() ;
    }
}

// Usage








