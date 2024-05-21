package adapter;


//target interface
interface DataReader1 {
    public String readData();
}

//adaptee
class JSONReader {

    public String readJSON(){
        return "Data from JSON";
    }
}

//adapter
class JSONReaderAdapter implements DataReader{
    private JSONReader jsonReader;

    public JSONReaderAdapter(JSONReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    @Override
    public String readData() {
        return jsonReader.readJSON();
    }
}

//main
class MainX{
    public static void main(String[] args) {
        DataReader reader = new JSONReaderAdapter(new JSONReader());
        System.out.println(reader.readData());

    }
}