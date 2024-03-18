package ro.ase.cts.sem4;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Singleton_1 singleton = Singleton_1.getInstance();
        singleton.doSomething();
    }
}
