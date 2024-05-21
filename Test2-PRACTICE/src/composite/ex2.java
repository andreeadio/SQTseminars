package composite;

//COMPOSITE
//structural design pattern

/*
Component : interfata care defineste toate metodele din structura
Leaf - implements component
Composite - implements component and contains an array of components, componentele se adauga prin setter nu in constructor
 */

import java.util.ArrayList;
import java.util.List;

interface GUIComponent {
    public void draw();
}

class Button implements GUIComponent {

    private String name;

    public Button(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Button "+name);
    }
}

class Panel implements GUIComponent{

    private String name;
    private List<GUIComponent> components = new ArrayList<>();
    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Panel "+ name);
        for(GUIComponent component: components)
        {
            component.draw();
        }
    }

    public void addComponent(GUIComponent component)
    {
        components.add(component);
    }
}

//testare in main
class Main3 {
    public static void main(String[] args) {

        Panel panel1 = new Panel("First");
        Button button1 = new Button("1");
        Button button2 = new Button("2");
        Panel panel2 = new Panel("Second");
        panel2.addComponent(button2);
        panel1.addComponent(panel2);
        panel1.addComponent(button1);

        panel1.draw();
    }
}