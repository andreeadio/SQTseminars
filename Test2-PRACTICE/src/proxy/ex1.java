package proxy;


//utilizat cand trebuie sa se respecte anumite conditii, cand sunt necesare verificari/validari
//se controleaza comportamentul si accesul la un obiect/functionalitati

//interfata
interface IRezervare {
    void anulareRezervare();
}

//clasa concreta cu atribute metode
class Rezervare implements IRezervare {

    private int nrNopti;
    private int cod;

    public Rezervare(int nrNopti, int cod) {
        super();
        this.nrNopti = nrNopti;
        this.cod = cod;
    }

    //getter
    public int getNrNopti() {
        return nrNopti;
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervarea " +cod+ " a fost anulata");
    }
}
//proxy
class RezervareProxy implements IRezervare{

    private Rezervare rezervare;

    public RezervareProxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void anulareRezervare() {
        if(rezervare.getNrNopti() ==1 )
        {
            rezervare.anulareRezervare();
        }
        else {
            System.out.println("Anularea a fost respinsa");
        }
    }
}

//main
class Main {
    public static void main(String[] args) {

        RezervareProxy rezervareProxy = new RezervareProxy(new Rezervare(3, 234));
        rezervareProxy.anulareRezervare();
        rezervareProxy = new RezervareProxy(new Rezervare(1,111));
        rezervareProxy.anulareRezervare();
    }
}