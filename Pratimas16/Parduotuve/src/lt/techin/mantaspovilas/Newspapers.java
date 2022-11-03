package lt.techin.mantaspovilas;

public class Newspapers extends Product {

    private double PVM;

    public Newspapers(String name, double price, int quantity, double PVM) {
        super(name, price, quantity);
        this.PVM = 1.05;
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
