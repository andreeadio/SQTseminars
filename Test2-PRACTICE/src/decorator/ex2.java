package decorator;


interface IPizza {

    String getDescription();
    double getPrice();
}

//concerete classes
class CapriciosaPizza implements IPizza {

    @Override
    public String getDescription() {

        return "Capriciosa pizza";
    }

    @Override
    public double getPrice() {
        return 27.90;
    }
}

class MargeritaPizza implements IPizza{

    @Override
    public String getDescription() {
        return "Margerita pizza";
    }

    @Override
    public double getPrice() {
        return 22.2;
    }
}

//abstract decorator class
abstract class PizzaDecorator implements IPizza{

    protected IPizza pizza;

    public PizzaDecorator(IPizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}

//concrete decorators
class CheeseCrownDecorator extends PizzaDecorator{

    public CheeseCrownDecorator(IPizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " add cheese crown ";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 3.5;
    }
}

class ExtraToppingDecorator extends PizzaDecorator{

    protected String topping;
    public ExtraToppingDecorator(IPizza pizza, String topping) {
        super(pizza);
        this.topping=topping;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", extra "+topping;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}
//main
class Main1{
    public static void main(String[] args) {
        IPizza pizza = new CapriciosaPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getPrice());
        pizza = new CheeseCrownDecorator(pizza);
        pizza = new ExtraToppingDecorator(pizza, "salami");
        System.out.println( pizza.getDescription());
        System.out.println(pizza.getPrice());

        //decorare multipla
        IPizza pizza1 = new MargeritaPizza();
        pizza1 = new ExtraToppingDecorator(new CheeseCrownDecorator(pizza1),"mozzarella");
        System.out.println( pizza1.getDescription());
        System.out.println(pizza1.getPrice());
    }
}
