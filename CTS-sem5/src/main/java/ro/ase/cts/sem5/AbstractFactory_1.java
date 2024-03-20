package ro.ase.cts.sem5;

import javax.imageio.stream.FileCacheImageInputStream;

interface Chair {
    String sitOn();
}

class ModernChair implements Chair {

    @Override
    public String sitOn() {
        return "Sitting on a modern chair";
    }
}

class VictorianChair implements Chair {

    @Override
    public String sitOn() {
        return "Sitting on a victorian chair";
    }
}

interface Sofa {
    String lieOn();
}

class ModernSofa implements Sofa{

    @Override
    public String lieOn() {
        return "Lying on a modern sofa";
    }
}

class VictorianSofa implements Sofa{

    @Override
    public String lieOn() {
        return "Lying on a victorian sofa";
    }
}

interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}


class  Client {
    private final FurnitureFactory furnitureFactory;

    public Client(FurnitureFactory furnitureFactory)
    {
        this.furnitureFactory = furnitureFactory;
    }

    public void useFurniture()
    {
        Chair chair = furnitureFactory.createChair();
        Sofa sofa = furnitureFactory.createSofa();

        System.out.println(chair.sitOn());
        System.out.println(sofa.lieOn());

    }
}
class Main_3 {
    public static void main(String[] args) {

     FurnitureFactory factory1 = new ModernFurnitureFactory();
//        Chair chair = factory1.createChair();
//        chair.sitOn();
//
       FurnitureFactory factory2 = new VictorianFurnitureFactory();
//        Sofa sofa = factory2.createSofa();
//        sofa.lieOn();

       Client client1 =new Client(factory1);
       client1.useFurniture();

       Client client2 = new Client(factory2);
       client2.useFurniture();
    }
}