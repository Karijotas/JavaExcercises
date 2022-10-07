package lt.techin.mantaspovilas.eglutesaukstis;
import java.util.Arrays;
import java.util.Scanner;
public class EglutesAukstis {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
            double vidurkis =0.0;
            int i = 1;
            int counter = 0;
            System.out.println("Kiek egluciu atvezta? ");
            int kiekis = Integer.valueOf(scanner.nextLine());
            double[] eglutes = new double[kiekis];
            while(i<=kiekis){
                System.out.println("Iveskite "+i+" eglutes auksti:");

                eglutes[counter] = Double.valueOf(scanner.nextLine());
                ++i;
                ++counter;
            }

            vidurkis = Arrays.stream(eglutes).sum() / eglutes.length;

            System.out.println("Eglutes aukscio vidurkis: "+ vidurkis +" cm");





    }
}
