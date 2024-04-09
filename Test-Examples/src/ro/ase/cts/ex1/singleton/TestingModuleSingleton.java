package ro.ase.cts.ex1.singleton;

public class TestingModuleSingleton implements ITesingModule{

    private static TestingModuleSingleton instance;
    private String data;
    private TestingModuleSingleton(String data)
    {
        this.data=data;
    }

    public static TestingModuleSingleton getInstance(String data)
    {
        if(instance ==null)
        {
            instance =new TestingModuleSingleton(data);
        }
        return instance;
    }

    @Override
    public String test() {
        return "Test passed";
    }
}
