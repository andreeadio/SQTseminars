package ro.ase.cts.sem6;

import java.util.HashMap;
import java.util.Map;


interface Report extends Cloneable {
    void generateReport();
    void setData(String data);
    void setFormat(String format);

    public Report clone();
}

class SalesReport implements Report {

    private String format;
    private String data;

    public SalesReport()  {
       // Thread.sleep(10000);
    }

    @Override
    public void generateReport() {

        System.out.println("Sales report done: "+ this.data +" "+ this.format);
    }

//    @Override
//    public String toString() {
//        return "SalesReport{" +
//                "format='" + format + '\'' +
//                ", data='" + data + '\'' +
//                '}';
//    }

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

class ReportGenerator {

    private Map<String,Report> reports = new HashMap<>();
    //Constructor
    public ReportGenerator()
    {
       //reports.put("sales", new SalesReport());
    }

    public Report generateReport(String type, String data, String format)
    {
        Report prototypeToReturn = reports.get(type);
        if(prototypeToReturn == null)
        {
                prototypeToReturn = new SalesReport();
                prototypeToReturn.setData(data);
                prototypeToReturn.setFormat(format);
                this.reports.put(type, prototypeToReturn);
        }
        return prototypeToReturn.clone();
    }


}

class Main {
    public static void main(String[] args) {
        ReportGenerator client = new ReportGenerator();
        Report prototype1 = client.generateReport("sales", "Info", "Excel");
        prototype1.generateReport();
      // System.out.println( prototype1.toString());

        Report prototype2 = client.generateReport("sales", null, null);
        prototype2.generateReport();
       // System.out.println( prototype2.toString());


    }
}