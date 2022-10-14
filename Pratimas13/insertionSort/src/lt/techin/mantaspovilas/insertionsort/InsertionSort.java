package lt.techin.mantaspovilas.insertionsort;

import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[1000000];
        fillData(data);
//        System.out.println(Arrays.toString(data));
        sortInsertionSort(data);
//        System.out.println(Arrays.toString(data));

    }

    private static void sortInsertionSort(int[] data) {
        long start = System.currentTimeMillis();
        int size = data.length;
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            while(j >= 0 && data[j] > key){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
        long end = System.currentTimeMillis();
        double sec = (end - start) / 1000.0;
        System.out.println(data.length + " elementų masyvas buvo surūšiuotas per " + sec + " sek.");
    }

    private static void fillData(int[] data) {
        int i = 0;
        while (i < data.length) {
            data[i] = rnd.nextInt(1000000);
            ++i;
        }
    }
}


