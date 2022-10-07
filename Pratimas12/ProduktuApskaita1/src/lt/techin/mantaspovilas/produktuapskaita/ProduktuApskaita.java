package lt.techin.mantaspovilas.produktuapskaita;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Scanner;
public class ProduktuApskaita {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        double[] prekes = {102.56, 215.72, 99.21, 200, 175.99, 214.99};

        avg = Math.round(Arrays.stream(prekes).average().getAsDouble()* 100.0) / 100.0;

        System.out.println("Vidutiniskai viena preke kainavo "+avg+ " Eur");
        System.out.println("Per diena pardave prekiu uz "+Arrays.stream(prekes).sum()+" Eur");


    }
}
