package adapter;

//target interface

//adaptee - cel ce trebuie adaptat

//adapterul care face override la target interface si contine o instanta a adaptee, o atribuie in constructor si face legatura cu

class CSVReader {
    public String readCSV(){
        return "Data from CSV";
    }
}

class XMLReader {
    public String readXML() {
        return "Data from XML";
    }
}

//target interface
interface DataReader {
    public String readData();
}

//adapters - override target interface contin instanta lui adaptee
//utilitate : nu modifici codul deja existent

class CSVAdapter implements DataReader {

    private CSVReader csvReader;

    public CSVAdapter(CSVReader csvReader)
    {
        this.csvReader=csvReader;
    }
    @Override
    public String readData() {
        return csvReader.readCSV();
    }
}

class XMLAdapter implements DataReader{

    private XMLReader xmlReader;
    public XMLAdapter(XMLReader xmlReader)
    {
        this.xmlReader = xmlReader;
    }
    @Override
    public String readData() {
        return xmlReader.readXML();
    }
}

//testare in main
class Main1 {
    public static void main(String[] args) {

        DataReader csvReader = new CSVAdapter(new CSVReader());
        System.out.println(csvReader.readData());
    }
}