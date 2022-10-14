package lt.techin.mantaspovilas.bubbles;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        int[] data = new int[5000000];
        fillData(data);
//        System.out.println(Arrays.toString(data));
        sortBubbleSort(data);
//        System.out.println(Arrays.toString(data));
    }
    private static void sortBubbleSort(int[] data) {
        long start = System.currentTimeMillis();
        int size = data.length;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        long end = System.currentTimeMillis();
        double sec = (end - start)/ 1000.0;
        System.out.println(data.length + " elementų masyvas buvo surūšiuotas per " + sec + " sek.");
    }
    private static void fillData(int[] data) {
        int i = 0;
        while (i < data.length){
            data[i] = rnd.nextInt(80000);
            ++i;
        }
    }
}
