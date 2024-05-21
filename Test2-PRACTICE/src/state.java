//State - folosit atunci cand se schimba starile obiectului

//context - clasa care are un internal state
//state - interfata/abstract class , define methods for objects
//concrete states - classes implement state

//state interface
interface State {
    void open(TCPConnection connection);
    void close(TCPConnection connection);
    void acknwledge(TCPConnection connection);
}


class TCPConnection {
    //has an internal state
    private State state;

    public TCPConnection() {
        state= new TCPClosedState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void open() {
        state.open(this);
    }


    public void close() {
        state.close(this);
    }


    public void acknwledge() {
        state.acknwledge(this);
    }
}

//concrete state classes
class TCPOpenState implements State{

    @Override
    public void open(TCPConnection connection) {
        System.out.println("Connection is already open ");
    }

    @Override
    public void close(TCPConnection connection) {
        System.out.println("Closing Connection");
        connection.setState(new TCPClosedState());
    }

    @Override
    public void acknwledge(TCPConnection connection) {
        System.out.println("acknowledging  data");

    }
}

class TCPClosedState implements State{
@Override
public void open(TCPConnection connection) {
    System.out.println("Openning Connection ");
    connection.setState(new TCPOpenState());
}

@Override
public void close(TCPConnection connection) {
    System.out.println(" Connection is already open");
}

@Override
public void acknwledge(TCPConnection connection) {
    System.out.println("cannot acknowledge data. connection closed");

}
}
//testare in main
class Main{
    public static void main(String[] args) {
        TCPConnection connection = new TCPConnection();
        connection.open();
        connection.acknwledge();
        connection.close();
        connection.acknwledge();
    }
}