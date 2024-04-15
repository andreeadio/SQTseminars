package ro.ase.cts.adapter;

 interface PaymentProcessor {
     void processPayment(double sum);
}


//Adaptee1
class PayPal {
    public void sendPayment(double sum)
    {
        System.out.println("Send payment: " + sum);
    }

}

//Adaptee2
class Stripe {
    public void makePayment(double sum) {
        System.out.println("Make payment: " + sum);
    }
}

// Adapter for XML
class PayPalAdapter implements PaymentProcessor {
    private PayPal payPal;
    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double sum) {
        this.payPal.sendPayment(sum);
    }
}

// Adapter for JSON
class StripeAdapter implements PaymentProcessor {
    private Stripe stripe;
    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double sum) {
        this.stripe.makePayment(sum);
    }
}

// Client code
class Ex2 {
    public static void main (String[] args) {
//        DataReader xmlAdapter = new XMLAdapter (new XMLDataReader());
//        DataReader jsonAdapter = new JSONAdapter (new JSONDataReader());
//        System.out.println(xmlAdapter.readData());
//        System.out.println(jsonAdapter.readData());

        PaymentProcessor payment1 = new StripeAdapter(new Stripe());
        PaymentProcessor payment2 = new PayPalAdapter(new PayPal());
        payment1.processPayment(100);
        payment2.processPayment(200);
    }
}