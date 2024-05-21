package decorator;

//interface
//concrete classes -> implements interface
//abstract decorator class -> implements interface
//concrete decorator class -> extending the abstract decorator

import javax.swing.plaf.synth.SynthLookAndFeel;

interface Subscription{

    String getDescription();
    double getPrice();
}

//concrete classes
class BasicSubscription implements Subscription {

    @Override
    public String getDescription() {
        return "Basic subscription";
    }

    @Override
    public double getPrice() {
        return 10.0;
    }
}

//decorator abstract
abstract class SubscriptionDecorator implements Subscription {

    protected Subscription subscription;

    public SubscriptionDecorator(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String getDescription() {
        return subscription.getDescription();
    }

    @Override
    public double getPrice() {
        return subscription.getPrice();
    }
}

//concrete decorators
class OflineViewingDecorator extends SubscriptionDecorator{

    public OflineViewingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return subscription.getDescription() + ", offline viewing";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 5.0;
    }
}

class HDStreamingDecorator extends SubscriptionDecorator{

    public HDStreamingDecorator(Subscription subscription) {
        super(subscription);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "HD streaming";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+3.0;
    }
}

//testare in main
class Test {
    public static void main(String[] args) {

        Subscription subscription = new BasicSubscription();

        //adaugare de optiuni
        subscription = new OflineViewingDecorator(subscription);

        //subscription = new HDStreamingDecorator(subscription);

        System.out.println(subscription.getDescription());
        System.out.println("Total price: " + subscription.getPrice());

    }
}