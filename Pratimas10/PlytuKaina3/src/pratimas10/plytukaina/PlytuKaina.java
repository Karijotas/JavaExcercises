package pratimas10.plytukaina;
import java.util.Scanner;
public class PlytuKaina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double plytuKiekis = 0;
        double plytuKaina = 0.0;
        double siena =0;
        System.out.println("Sienos ilgis m: ");
        int ilgis = Integer.valueOf(scanner.nextLine());
        System.out.println("Sienos aukstis m: ");
        int aukstis = Integer.valueOf(scanner.nextLine());
        System.out.println("Plytos kaina, eur: ");
        double kaina = Double.valueOf(scanner.nextLine());

        siena = ((ilgis*aukstis));
        plytuKiekis =(siena)/0.02;
        plytuKaina = plytuKiekis * kaina;
        System.out.println("Plytu kiekis "+(int)plytuKiekis);
        System.out.println("Plytos kainuos "+ plytuKaina + " eur");
    }
}
