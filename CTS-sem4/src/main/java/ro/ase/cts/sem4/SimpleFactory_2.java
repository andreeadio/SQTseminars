package ro.ase.cts.sem4;


interface Shape{
    void draw();
}

class Square implements Shape{

    @Override
    public void draw() {
        System.out.println("...drawing square");
    }
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("...drawing circle");

    }
}

class ShapeFactory {
    public  static Shape createShape(String type)
    {
        if("Square".equalsIgnoreCase(type))
        {
            return new Square();
        }else  if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        } else {
            throw new IllegalArgumentException("Invalid shape type");
        }
    }
}

class Main_2 {

    public static void main(String[] args)
    {
        Shape square = ShapeFactory.createShape("Square");
        square.draw();

        Shape circle = ShapeFactory.createShape("Circle");
        circle.draw();

        System.out.println("****************************");

        Shape shape = ShapeFactory.createShape("Square");
        shape.draw();
        shape = ShapeFactory.createShape("circle");
        shape.draw();
    }
}