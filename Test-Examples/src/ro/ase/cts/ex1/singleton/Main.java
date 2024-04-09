package ro.ase.cts.ex1.singleton;

public class Main {
    public static void main(String[] args) {
        ITesingModule tesingModule = TestingModuleSingleton.getInstance("tests");
        String results =tesingModule.test();
        System.out.println(results);
    }
}
