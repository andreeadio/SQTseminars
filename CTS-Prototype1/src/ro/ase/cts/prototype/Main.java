package ro.ase.cts.prototype;

public class Main {
    public static void main(String[] args) {
        ReportGenerator client = new ReportGenerator();
        Report prototype1 = client.generateReport("sales", "Info", "Excel");
        prototype1.generateReport();

        Report prototype2 = client.generateReport("sales", null, null);
        prototype2.generateReport();


    }

}
