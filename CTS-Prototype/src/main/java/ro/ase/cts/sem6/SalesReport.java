package ro.ase.cts.sem6;

public class SalesReport implements Report {
    private String format;
    private String data;

    public SalesReport()  {
        // Thread.sleep(10000);
    }

    @Override
    public void generateReport() {

        System.out.println("Sales report done: "+ this.data +" "+ this.format);
    }


    @Override
    public void setData(String data) {
        this.data=data;
    }

    @Override
    public void setFormat(String format) {
        this.format=format;
    }

    @Override
    public Report clone() {

        SalesReport result = new SalesReport();
        result.setData(this.data);
        result.setFormat(this.format);
        return result;
    }
}
