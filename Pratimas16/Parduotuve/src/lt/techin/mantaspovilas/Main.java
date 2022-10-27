package lt.techin.mantaspovilas;

public class Main {
    public static void main(String[] args) {
        Food maistas = new Food("duona", 12.0, 2);

        maistas.getPVM();
        System.out.println(maistas.getPriceWithPVM());

        Books knyga = new Books("knyga", 15, 1);
        knyga.getPVM();
        System.out.println(knyga.getPriceWithPVM());
    }
}
