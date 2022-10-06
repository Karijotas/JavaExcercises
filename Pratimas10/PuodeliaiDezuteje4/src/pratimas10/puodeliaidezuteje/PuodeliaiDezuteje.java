package pratimas10.puodeliaidezuteje;
import java.util.Scanner;
public class PuodeliaiDezuteje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dezuteje = 3;
        int pilnos = 0;
        int like = 0;
        int puodeliuDezuteje = 0;
        System.out.println("Puodeliu, kuriuos reikia supakuoti, skaicius: ");
        int puodeliai = Integer.valueOf(scanner.nextLine());

        pilnos = puodeliai / dezuteje;
        puodeliuDezuteje = pilnos * dezuteje;
        like = puodeliai%dezuteje;
        System.out.println("Pilnu dezuciu skaicius: " + pilnos);
        System.out.println("Nesupakuotu puodeliu skaicius: "+ like);
    }
}
