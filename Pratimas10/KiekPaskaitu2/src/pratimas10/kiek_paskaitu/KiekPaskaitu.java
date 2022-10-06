package pratimas9.kiek_paskaitu;
import java.util.Scanner;

public class KiekPaskaitu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int paskaitosMin = 45;
        int sum=0;
        int totalMin= 0;
        System.out.println("Kiek paskaitu yra pirmadieni?");
        int pirm = Integer.valueOf(scanner.nextLine());
        System.out.println("Kiek paskaitu yra antradieni?");
        int antr = Integer.valueOf(scanner.nextLine());
        System.out.println("Kiek paskaitu yra treciadieni?");
        int trec = Integer.valueOf(scanner.nextLine());
        System.out.println("Kiek paskaitu yra ketvirtadieni?");
        int ketv = Integer.valueOf(scanner.nextLine());
        System.out.println("Kiek paskaitu yra penktadieni?");
        int penkt = Integer.valueOf(scanner.nextLine());

        sum = pirm + antr + trec + ketv + penkt;
        totalMin = sum * paskaitosMin;

        System.out.println("Paskaitu skaicius per savaite - "+sum);
        System.out.println("Tai sudaro "+totalMin+" minuciu");
    }
}
