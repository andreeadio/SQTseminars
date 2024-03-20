package ro.ase.cts.sem5;

interface Burger_1{
    void prepare();
}

class VeggieBurger_1 implements Burger_1{

    @Override
    public void prepare() {
        System.out.println("veggie burger done");
    }
}

class BeefBurger_1 implements Burger_1{
    @Override
    public void prepare() {
        System.out.println("beef burger done");

    }
}

abstract  class Restaurant_1 {
    public Burger_1 orderBurger() {
        Burger_1 burger = createBurger_1();
        burger.prepare();
        return burger;
    }

    public abstract Burger_1 createBurger_1();
}

class BeefBurgerRestaurant extends Restaurant_1 {

    @Override
    public Burger_1 createBurger_1() {
        return new BeefBurger_1();
    }
}

class VeggieBurgerRestaurant extends Restaurant_1 {
    @Override
    public Burger_1 createBurger_1() {
        return new VeggieBurger_1();
    }
}
class Main_1 {

    public static void main(String[] args) {
        System.out.println("****************************");

        Restaurant_1 beefResto = new BeefBurgerRestaurant();
        Burger_1 beefBurger =  beefResto.orderBurger();


        Restaurant_1 veggieResto = new VeggieBurgerRestaurant();
        Burger_1 veggieBurger =  veggieResto.orderBurger();

        System.out.println("****************************");

    }
}

