package pratimas10.tunelis;
import java.util.Scanner;
public class Tunelis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double laikas =0.0;
        double tunelioIlgisKm = 0.264;
        System.out.println("Koks automobilio greitis?:");
        double greitis = Double.valueOf(scanner.nextLine());

        laikas = greitis * tunelioIlgisKm;
        System.out.println("Automobilis tuneli pravaziuos per "+laikas+" s");

    }
}
