package ro.ase.cts.sem4;

interface Animal{
    void sound();
}

class Dog implements Animal{

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}

class Cat implements Animal{
    @Override
    public void sound() {
        System.out.println("Meow");

    }
}

class AnimalFactory {
    public  static Animal createAnimal(String type)
    {
        if("Dog".equalsIgnoreCase(type))
        {
            return new Dog();
        }else  if("Cat".equalsIgnoreCase(type)){
            return new Cat();
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}

class Main_1 {

    public static void main(String[] args)
    {
        Animal dog = AnimalFactory.createAnimal("Dog");
        dog.sound();

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.sound();

        System.out.println("****************************");

        Animal animal =  AnimalFactory.createAnimal("Dog");
        animal.sound();
        animal = AnimalFactory.createAnimal("Cat");
        animal.sound();
    }
}

