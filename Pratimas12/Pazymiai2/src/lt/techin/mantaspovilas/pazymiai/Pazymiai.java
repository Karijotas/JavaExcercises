package lt.techin.mantaspovilas.pazymiai;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

public class Pazymiai {
    private static DecimalFormat df = new DecimalFormat("#.##");
    public static void main(String[] args) {
        int i = 1;
        int[] pazymiai = {1, 5, 8, 7, 10, 9, 9, 8, 7, 7, 4, 6, 8};



        while ( i <= 10) {
            System.out.println(i+"- "+ df.format(getPercentageOfGrade(pazymiai, i))+"%");
            ++i;
        }

    }

    private static double getPercentageOfGrade(int[] arr, int i) {
        double percentage = 0.0;
        double pazymSkaic = 0;
        pazymSkaic = Arrays.stream(arr).count();

        percentage = (getCountOfValueFromArray(arr, i) * 100) / pazymSkaic;
        return percentage;


    }

    private static int getCountOfValueFromArray(int[] arr, int n) {
        int count = 0;
      for (int each : arr) {
          if (each == n){
              ++count;
          }
      }
      return count;
    }

}


