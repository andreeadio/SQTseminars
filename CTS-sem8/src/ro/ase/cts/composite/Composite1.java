package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;
interface FileSystemItem {
    void printName();
}
class File implements FileSystemItem {
    private String name;
    public File(String name) {
        this.name = name;
    }

    public void printName() {
            System.out.println("File:" + name);
    }
}

class Directory implements FileSystemItem {

    private List<FileSystemItem> items = new ArrayList<>();
    private String name;

    public Directory(String name) {
        this.name = name;
    }

    public void printName() {

        System.out.println("Directory: " + name);

        for (FileSystemItem item : items) {
            item.printName();
        }
    }

    public void addItem(FileSystemItem item) {
        items.add(item);
    }
}

class Ex1 {
    public static void main(String[] args) {
        // Creating files
        File file1 = new File("Filel.txt");
        File file2 = new File("File2.docx");
        File file3 = new File("File3.pdf");
        // Creating the root directory
            Directory rootDirectory = new Directory("RootDirectory");
        // Adding files to the root directory
            rootDirectory.addItem(file1);
            rootDirectory.addItem(file2);
        // Creating a sub-directory
            Directory subDirectory = new Directory("SubDirectory");
        // Adding a file to the sub-directony
            subDirectory.addItem(file3);
        // Adding the sub-directory to the root directory
        rootDirectory.addItem(subDirectory);
        // Printing the contents of the root directory
            rootDirectory.printName();
    }
}