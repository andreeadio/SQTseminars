package composite;


//composite se foloseste cand se creeaza o structura arboresceta

//component: este o interfata defineste metodele
// folosite in structura ierarhica
//leaf(nu are copii) si composite implementeaza component
//component implementeaza component si contine un array de components


import java.util.ArrayList;
import java.util.List;

interface FileSystemItem {
    public void printName();
}

//leaf- nu are copii , override component
class File implements FileSystemItem{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("File: "+name);

    }
}

class Directory implements FileSystemItem{

    private String name;
    private List<FileSystemItem> items = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Directory: "+ name);
        for (FileSystemItem item: items) {
            item.printName(); //itemul poate fi de diferite tipuri: un folder poate contine fisiere sau alte foldere
        }
    }

    //adaugare componente
    public void addItem(FileSystemItem item)
    {
        items.add(item);
    }
}

//testarea in main

class Main2{
    public static void main(String[] args) {
        File file1 = new File("File1.txt");
        File file2 = new File("Tema2.docx");

        Directory directory1 = new Directory("RootDirectory");
        directory1.addItem(file1);
        directory1.addItem(file2);

        Directory directory2 = new Directory("SecondDirectory");
        directory1.addItem(directory2);
        directory1.printName();

    }
}