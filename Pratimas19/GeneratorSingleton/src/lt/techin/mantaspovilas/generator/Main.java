package lt.techin.mantaspovilas.generator;

public class Main {
    public static void main(String[] args) {
        Generator gn = Generator.getInstance();

        gn.generate(1,10);
    }
}
