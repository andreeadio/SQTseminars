package composite;

//component -descrie metodele
//leaf  - override component
//composite - override component si contine un array the components

import java.util.List;

interface FileSystemItem1 {
    public void printName();
}

class File1 implements FileSystemItem1 {

    private String name;

    public File1(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("File: "+name);
    }
}

class Directory1 implements FileSystemItem1 {

    private String name;
    private List<FileSystemItem1> items;
    public Directory1(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("Directory: "+ name);
        for(FileSystemItem1 item : items)
        {
            item.printName();
        }
    }

    public void addItem(FileSystemItem1 item) {
        items.add(item);
    }
}

//main
class MainY {
    public static void main(String[] args) {
        Directory directory1 = new Directory("First directory");
        File file1 = new File("File.txt");
        directory1.addItem(file1);
        directory1.printName();
    }

}