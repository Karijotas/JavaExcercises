package lt.techin.mantaspovilas.productregister;

public class main {

    public static void main(String[] args) {

        Product bread = new Product(1, "bread");
        ProductRegister.addProduct(bread);

        ProductRegister.searchProductsById(2);
    }
}
