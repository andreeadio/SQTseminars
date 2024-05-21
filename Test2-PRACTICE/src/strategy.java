//se utilizeaza cand avem diferiti algoritmi din care putem alege

//strategy are aceeasy conformatie ca state
//interface
interface TextFormatter {
    public String formatText(String text);
}

//concrete classes care implementeaza interfata

class LowerCaseFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toLowerCase();
    }
}

class UpperCaseFormatter implements TextFormatter{

    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}

//context class - strategy class
class TextEditor{
    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    //setter
    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public String formatText(String text) {

        return formatter.formatText(text);
    }
}

class Main4{
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new LowerCaseFormatter());
        System.out.println(editor.formatText("ANDrEEA"));
        editor.setFormatter(new UpperCaseFormatter());
        System.out.println(editor.formatText("ana are mere"));

    }
}
//state example
interface State1{
    void open(TCPConnection1 connection);
    void close(TCPConnection1 connection);

    void transfer(TCPConnection1 connection);
    //+others
}

//concerete state classes
class OpenState implements State1{

    @Override
    public void open(TCPConnection1 connection) {
        System.out.println(" already open");
    }

    @Override
    public void close(TCPConnection1 connection) {
        System.out.println("closing...");
        connection.setInternalState(new ClosedState());
    }

    @Override
    public void transfer(TCPConnection1 connection) {

    }
}

class ClosedState implements State1{


    @Override
    public void open(TCPConnection1 connection) {
        System.out.println("openning...");
        connection.setInternalState(new OpenState());
    }

    @Override
    public void close(TCPConnection1 connection) {
        System.out.println("already closed");
    }

    @Override
    public void transfer(TCPConnection1 connection) {

    }
}

//context class -> contine un internal state
class TCPConnection1 {
    private State1 internalState;

    public TCPConnection1() {
        this.internalState = new ClosedState();
    }
    //setter

    public void setInternalState(State1 internalState) {
        this.internalState = internalState;
    }

    public void open(){
        internalState.open(this);
    }

    public void close(){
        internalState.close(this);
    }
}

//class Main3{
//    public static void main(String[] args) {
//        TCPConnection1 connection1=new TCPConnection1();
//        connection1.close();
//        connection1.open();
//        connection1.open();
//    }
//}