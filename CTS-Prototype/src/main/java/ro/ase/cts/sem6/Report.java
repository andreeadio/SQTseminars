package ro.ase.cts.sem6;

public interface Report {
    void generateReport();
    void setData(String data);
    void setFormat(String format);

    public Report clone();
}
