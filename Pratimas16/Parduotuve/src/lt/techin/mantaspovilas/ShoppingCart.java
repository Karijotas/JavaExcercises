package lt.techin.mantaspovilas;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements ShoppingCartItem{
    private List<ShoppingCartItem> items = new ArrayList<>();

    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double getPriceWithPVM() {
        return 0;
    }

    public void add(ShoppingCartItem item){

    }
    public double getTotalPrice() {
        double totalPrice = 0;
        for(ShoppingCartItem item : items){
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithPVM() {
        double totalPriceWithVat = 0;
        for(ShoppingCartItem item : items){
            totalPriceWithVat += item.getPriceWithPVM();
        }
        return totalPriceWithVat;
    }
}