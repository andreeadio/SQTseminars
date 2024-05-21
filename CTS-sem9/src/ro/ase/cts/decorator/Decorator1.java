package ro.ase.cts.decorator;


public class Decorator1 {
}

interface DataService {
    String fetchData();
}
class DataServiceConcrete implements DataService{
    public String fetchData()
    {
        return "Data";
    }
}



class LoggingDecorator implements DataService
{
    private DataService wrappee;

    LoggingDecorator(DataService wrappee)
    {
        this.wrappee = wrappee;
    }

    public String fetchData()
    {
        System.out.println("Fetching data...");
        return wrappee.fetchData();
    }
}

class Example2{
    public static void main(String[] args) {
        DataService myDataService = new LoggingDecorator(new DataServiceConcrete());
        System.out.println(myDataService.fetchData());

        DataService realDataService = new DataServiceConcrete();
        DataService loggedDataService = new LoggingDecorator(realDataService);

        String data = loggedDataService.fetchData();
        System.out.println("Data Retrieved: "+ data);
    }
}