package lt.techin.mantaspovilas.autobusai;
import java.util.Scanner;
public class Autobusai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int emptyBus = 0;
        int timeSum = 0;
        int avgTime = 0;
        int travellerSum = 0;
        int c = 1;
        int i = 0;
        System.out.println("Iveskite kiek autobusu vyksta kasdien: ");
        int autobusNr = Integer.valueOf(scanner.nextLine());
        while (i<=autobusNr){
            while (c<=autobusNr){
                System.out.println(c+" autobuso vaziavimo laikas(val):");
                int travelTimeH = Integer.valueOf(scanner.nextLine());
                System.out.println(c+" autobuso vaziavimo laikas(min):");
                int travelTimeM = Integer.valueOf(scanner.nextLine());
                System.out.println(c+" autobusas perveza keleiviu:");
                int travellers = Integer.valueOf(scanner.nextLine());
                if (travellers<10){
                    ++emptyBus;
                }

                timeSum += (travelTimeH * 60) + travelTimeM;
                travellerSum += travellers;
                ++c;
                continue;
            }
            ++i;
        }
        avgTime = timeSum / autobusNr;
        System.out.println("Bendrai perveztu keleiviu skaicius: "+travellerSum);
        System.out.println("Vidutinis sugaistas vaziavimo laikas (min): "+ avgTime);
        System.out.println("Autobusu su maziau nei 10 keleiviu: " + emptyBus);
    }
}
