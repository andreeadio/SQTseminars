package ro.ase.cts.sem1;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        try {
            double x = calculator.readVariable();
            double y = calculator.readVariable();
            double x5 = calculator.multiply(x, 5);
            double y7= calculator.multiply(y, 7);
            double result = calculator.sum(x5, y7);
            System.out.println(result);

        } catch (NumberFormatException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }



    }

}