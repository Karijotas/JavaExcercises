package lt.techin.mantaspovilas;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Food maistas = new Food("duona", 12.0, 2);

        maistas.getPVM();
        System.out.println(maistas.getPriceWithPVM());

        Books knyga = new Books("knyga", 15, 1);
        knyga.getPVM();
        System.out.println(knyga.getPriceWithPVM());


        ShoppingCart krepselis = new ShoppingCart();

        krepselis.add(maistas);
        krepselis.add(knyga);

        System.out.println(krepselis.getPrice());
    }
}
