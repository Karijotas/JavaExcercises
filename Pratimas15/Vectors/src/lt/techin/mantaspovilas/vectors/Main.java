package lt.techin.mantaspovilas.vectors;

public class Main {
    public static void main(String[] args) {
        Vectors v1 = new Vectors(3,6, 6);
        Vectors v2 = new Vectors(2,8,4);

        v1.scalarMultiplication(v2);
    }
}
