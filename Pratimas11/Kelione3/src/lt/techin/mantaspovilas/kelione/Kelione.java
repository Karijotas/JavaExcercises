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

        int counter = talpa;
       for (int i = 0; counter>=0;++i) {
           if (i%2 !=0){
               counter -= (2*sanaudos);
               ++i;
           }
                counter -= sanaudos;
                ++i;
                sum = i;

        }
        System.out.println(sum);

    }
}
