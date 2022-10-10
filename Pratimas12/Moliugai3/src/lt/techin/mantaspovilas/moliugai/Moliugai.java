package lt.techin.mantaspovilas.moliugai;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Moliugai {
    private static DecimalFormat df = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int c = 0;

        System.out.println("Kiek moliūgų turite:");
        int kiekis = Integer.valueOf(scanner.nextLine());
        double[] moliugai = new double[kiekis];
        System.out.println("Koks yra mažiausias priimamų moliūgų svoris:");
        double lowest = Double.valueOf(scanner.nextLine());
        System.out.println("Koks yra didžiausias priimamų moliūgų svoris:");
        double highest = Double.valueOf(scanner.nextLine());

        while (c < kiekis) {
            System.out.println("Įveskite " + i + " moliūgo svorį: ");
            moliugai[c] = Double.valueOf(scanner.nextLine());
            ++c;
            ++i;
        }

        double avgWeight = Arrays.stream(moliugai).average().getAsDouble();
        double atrinkti = getCountOfValueFromArray(moliugai, lowest, highest);
        System.out.println("Visų moliūgų vidutinis svoris: " + avgWeight + " kg");
        System.out.println("Į supirkimą atrinkta moliūgų: " + df.format(atrinkti));
        System.out.println("Vidutinis atrinkto moliūgo svoris: " + df.format(Arrays.stream(newArray(moliugai, lowest, highest)).average().getAsDouble())+ " kg");
    }

    private static double[] newArray(double[] arr, double n, double h) {
        int count = 0;
        double[] Array = new double[getCountOfValueFromArray(arr, n, h)];
        for (double each : arr) {
            if (each >= n & each <= h) {
                Array[count] = each;
                ++count;
            }
        }
        return Array;
    }
    private static int getCountOfValueFromArray(double[] arr, double n, double h) {
        int count = 0;
        for (double each : arr) {
            if (each >= n & each <= h) {

                ++count;
            }
        }
        return count;
    }

}
