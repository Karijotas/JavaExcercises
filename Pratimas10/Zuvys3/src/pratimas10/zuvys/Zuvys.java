package pratimas10.zuvys;
import java.util.Scanner;
public class Zuvys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gyvena=0;
        System.out.println("Kiek zuvu gyvena akvariume? ");
        int gyvenaPradzioje = Integer.valueOf(scanner.nextLine());
        System.out.println("Kiek zuvu i akvariuma idedama kiekviena diena?");
        int zuvysAddKasdien = Integer.valueOf(scanner.nextLine());
        System.out.println("Kiek dienu praejo? ");
        int dienu = Integer.valueOf(scanner.nextLine());

        gyvena = gyvenaPradzioje + (zuvysAddKasdien*dienu);
        System.out.println("Po "+dienu+" dienu akvariume gyvens "+ gyvena+ " zuvu.");

    }
}
