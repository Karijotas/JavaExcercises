package lt.techin.mantaspovilas;

import java.lang.annotation.Inherited;
import java.lang.annotation.Native;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class Books extends Product {

    private double PVM;

    public Books(String name, double price, int quantity) {
        super(name, price, quantity);
        this.PVM = 1.09;
    }


    @Override
    public void getPVM() {
        System.out.println("Produkto " + super.getName() + " PVM yra: " + (int) (PVM * 100 - 100) + "%");
    }

    @Override
    public double getPriceWithPVM() {
        return getPrice() * PVM;
    }

}
