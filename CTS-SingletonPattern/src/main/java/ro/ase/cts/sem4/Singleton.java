package ro.ase.cts.sem4;

public class Singleton {

    private static Singleton instance;
    private String data;

    private Singleton(String data)
    {
        this.data=data;
    }

    public static Singleton getInstance(String data)
    {
        if(instance == null)
        {
            instance = new Singleton(data);
        }
        return instance;
    }
}

//Singleton is a creational design pattern
// that ensures only a single instance of a class
// exists throughout an application and
// provides access to that instance
// from anywhere in the codebase.

/* In terms of clean code , it violates:
Single Responsability Principle (SRP) - every class should have one purpose
Singleton class has 2 responsabilities - one to create an instance and to do the actual task

Open Close Principle - Open for extension closed for modification. singleton is never open for extention.
 */

//ex: Database connection, logger