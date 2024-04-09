package ro.ase.cts.adapter;


// Target interface
 interface DataReader {
    String readData();
}

//Adaptee1
class XMLDataReader {
    public String readXML(){
        return "Data from XML";
    }

}

//Adaptee2
class JSONDataReader {
    public String readJSON() {
        return "Data from JSON";

    }
}

// Adapter for XML
class XMLAdapter implements DataReader {
    private XMLDataReader xmlReader;
    public XMLAdapter(XMLDataReader xmlReader) {
        this. xmlReader = xmlReader;
    }
    @Override
    public String readData() {
        return xmlReader.readXML();
    }
}

// Adapter for JSON
class JSONAdapter implements DataReader {
    private JSONDataReader jsonReader;
    public JSONAdapter(JSONDataReader jsonReader) {
        this.jsonReader = jsonReader;
    }

    @Override
    public String readData()
    {
        return jsonReader.readJSON();
    }
}

// Client code
class Ex1 {
    public static void main (String[] args) {
        DataReader xmlAdapter = new XMLAdapter (new XMLDataReader());
        DataReader jsonAdapter = new JSONAdapter (new JSONDataReader());
        System.out.println(xmlAdapter.readData());
        System.out.println(jsonAdapter.readData());
    }
}