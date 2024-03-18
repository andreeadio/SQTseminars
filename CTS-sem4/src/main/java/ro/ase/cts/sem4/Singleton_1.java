package ro.ase.cts.sem4;

public class Singleton_1 {

    private static Singleton_1 instance;

    private Singleton_1() {
    }

    public static Singleton_1 getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton_1();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton is doing something");
    }
}