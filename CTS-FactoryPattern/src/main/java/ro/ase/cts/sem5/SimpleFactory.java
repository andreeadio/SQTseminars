package ro.ase.cts.sem5;


interface Burger{
    void prepare();
}

class VeggieBurger implements Burger{

    @Override
    public void prepare() {
        System.out.println("veggie burger done");
    }
}

class BeefBurger implements Burger{
    @Override
    public void prepare() {
        System.out.println("beef burger done");

    }
}

class SimpleBurgerFactory {
    public static Burger createBurger(String request)
    {
        Burger burger = null;
        if("BEEF".equalsIgnoreCase(request))
        {
            return new BeefBurger();
        }else  if("VEGGIE".equalsIgnoreCase(request)){
            return new VeggieBurger();
        } else {
            throw new IllegalArgumentException("Invalid animal type");
        }
    }
}
class Restaurant {
    public static Burger orderBurger(String request) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();
        Burger burger = factory.createBurger(request);
        burger.prepare();
        return burger;
    }
}

class Main {

    public static void main(String[] args) {
        System.out.println("****************************");

        Burger beef = SimpleBurgerFactory.createBurger("Beef");
        beef.prepare();

        Burger veggie = SimpleBurgerFactory.createBurger("veggie");
        veggie.prepare();

        System.out.println("****************************");

    }
}

