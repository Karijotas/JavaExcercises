package lt.technin.mantaspovilas.quicksort;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[5000000];
        countTime(data, 1);
//        System.out.println(Arrays.toString(data));
        countTime(data, 2);
//        System.out.println(Arrays.toString(data));


    }
    private static void countTime(int[] data, int operationNumber) {
        long start = System.currentTimeMillis();

        switch (operationNumber){
            case 1:
                fillData(data);
                break;
            case 2:
                sortQuickSort(data, 0, data.length - 1);
                break;
        }

        long end = System.currentTimeMillis();
        double sec = (end - start) / 1000.0;
        System.out.println("Uzduotis atlikta per " + sec + " sek.");
    }
    private static void sortQuickSort(int[] data, int low, int high) {

        if (low < high) {
            int pivot = partition(data, low, high);
            sortQuickSort(data, low, pivot - 1);
            sortQuickSort(data, pivot +1, high);
        }
    }

    private static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high ;j++){
            if(data[j] <= pivot){
                ++i;
                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }
        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return (i + 1);
    }

    private static void fillData(int[] data) {
        int i = 0;
        while (i < data.length) {
            data[i] = rnd.nextInt(5000000);
            ++i;
        }
    }
}
