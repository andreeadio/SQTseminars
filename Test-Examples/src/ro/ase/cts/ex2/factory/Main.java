package ro.ase.cts.ex2.factory;

public class Main {
    public static void main(String[] args) {
        ShowFactory showFactory = new ConcertFactory();
        Concert concert = (Concert) showFactory.createShow();
        concert.printDetails();

    }
}
