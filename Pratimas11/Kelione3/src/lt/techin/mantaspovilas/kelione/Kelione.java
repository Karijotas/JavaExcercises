package lt.techin.mantaspovilas.kelione;
import java.util.Scanner;
public class Kelione {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Iveskite kuro bako talpa: ");
        int talpa = Integer.valueOf(scanner.nextLine());
        System.out.println("Iveskite kuro sanaudas: ");
        int sanaudos = Integer.valueOf(scanner.nextLine());

        int kurasPerDviDienas = sanaudos + (2*sanaudos);
        int vienaDien = kurasPerDviDienas / 2;
        sum = talpa / vienaDien;

        System.out.println(sum);
    }
}
