package lt.techin.mantaspovilas.selectionsort;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[100000];
        fillData(data);
//        System.out.println(Arrays.toString(data));
        sortSelectionSort(data);
//        System.out.println(Arrays.toString(data));

    }

    private static void sortSelectionSort(int[] data) {
        long start = System.currentTimeMillis();
        int size = data.length;
        for (int i = 0; i < size; i++)
        {
            int index = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j] < data[index]) {
                    index = j;
                }
            }
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
        long end = System.currentTimeMillis();
        double sec = (end - start) / 1000.0;
        System.out.println(data.length + " elementų masyvas buvo surūšiuotas per " + sec + " sek.");
    }

    private static void fillData(int[] data) {
        int i = 0;
        while (i < data.length) {
            data[i] = rnd.nextInt(100000);
            ++i;
        }
    }
}
