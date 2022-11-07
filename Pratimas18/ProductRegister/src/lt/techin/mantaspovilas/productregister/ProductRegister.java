package lt.techin.mantaspovilas.productregister;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProductRegister {

    private static Set<Product> products = new LinkedHashSet<>();

    public static void addProduct(Product product){
        products.add(product);
    }

    public static void searchProductsById(int id){
        for (Product product: products){
            if (product.getId() == id){
                System.out.println(product);
            } else {
                System.out.println("No such item");
            }
        }

    }
}
