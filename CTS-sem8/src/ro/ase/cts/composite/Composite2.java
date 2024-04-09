package ro.ase.cts.composite;

import java.util.ArrayList;
import java.util.List;
interface GUIComponent {
    void draw();
}

class Button implements GUIComponent {
    private String function;
    public Button(String function) {
        this.function = function;
    }

    @Override
    public void draw() {
        System.out.println("Button:" + function);
    }
}

class Panel implements GUIComponent {

    private List<GUIComponent> components = new ArrayList<>();
    private String name;

    public Panel(String function) {
        this.name = function;
    }

    @Override
    public void draw () {

        System.out.println("Panel: " + name);

        for (GUIComponent component : components) {
            component.draw();
        }
    }

    public void addComponent(GUIComponent comp) {
        components.add(comp);
    }
}

//main
class Client {
    public static void main(String[] args) {
        // Creating files
        Button button1 = new Button("delete");
        Button button2 = new Button("add");
        Button button3 = new Button("edit");
        // Creating the root directory
        Panel panel = new Panel("Panel");
        // Adding files to the root directory
        panel.addComponent(button1);
        panel.addComponent(button2);
        // Creating a sub-directory
        Panel subPanel = new Panel("SubPanel");
        // Adding a file to the sub-directony
        subPanel.addComponent(button3);
        // Adding the sub-directory to the root directory
        panel.addComponent(subPanel);
        // Printing the contents of the root directory
        panel.draw();
    }
}