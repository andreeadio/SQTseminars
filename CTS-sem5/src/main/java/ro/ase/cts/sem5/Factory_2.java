package ro.ase.cts.sem5;

interface Document{
    void open();
    void save();
}

class TextDocument implements Document {

    @Override
    public void open() {
        System.out.println("text file opened");
    }

    @Override
    public void save() {
        System.out.println("text file saved");
    }
}

class ImageDocument implements Document{

    @Override
    public void open() {
        System.out.println("image opened");
    }

    @Override
    public void save() {
        System.out.println("image saved");
    }
}

interface DocumentFactory {
    Document  createDocument();
}

class TextDocumentFactory implements DocumentFactory {

    @Override
    public Document createDocument() {
        return new TextDocument();
    }
}
class ImageDocumentFactory implements DocumentFactory  {
    @Override
    public Document createDocument() {
        return new ImageDocument();
    }
}

class Main_2 {

    public static void main(String[] args) {
        DocumentFactory txtFactory = new TextDocumentFactory();
        Document txt = txtFactory.createDocument();
        txt.open();
        txt.save();

        DocumentFactory imgFactory = new ImageDocumentFactory();
        Document img = imgFactory.createDocument();
        img.open();
        img.save();
    }

}

