package lt.techin.mantaspovilas.maratonas;
import java.util.Arrays;
import java.util.Scanner;
public class Maratonas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diff = 0;
        int fastest = 0;
        int avg = 0;
        int i = 1;
        int c = 0;
        System.out.println("Kiek dalyvavo begiku? ");
        int runners = Integer.valueOf(scanner.nextLine());
        int[] runTimes = new int[runners];
        while(i<=runners){
            System.out.println("Iveskite "+i+" begiko laika(s):");
            runTimes[c] = Integer.valueOf(scanner.nextLine());
            ++i;
            ++c;
        }

        avg = Arrays.stream(runTimes).sum() / runners;
        fastest = Arrays.stream(runTimes).min().getAsInt();
        diff = avg - fastest;

        System.out.println("Greiciausio begiko laikas: "+fastest+" sek.");
        System.out.println("Jis buvo "+diff+" sek geresnis uz vidurki.");
    }
}
