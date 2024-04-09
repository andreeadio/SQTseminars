package ro.ase.cts.sem6;

import java.util.HashMap;
import java.util.Map;

public class ReportGenerator {
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
