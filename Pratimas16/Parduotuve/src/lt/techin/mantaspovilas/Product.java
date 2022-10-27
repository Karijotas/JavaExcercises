package lt.techin.mantaspovilas;

public class Product {

    private String name;
    private double price;
    private double PVM;

    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.PVM = 1.21;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void getPVM() {
        System.out.println("Produkto "+ name+" PVM yra: " +(int)(PVM * 100 - 100) + "%");
    }

    public double getPriceWithPVM() {
        return getPrice() * PVM;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", PVM=" + PVM +
                '}';
    }

}
