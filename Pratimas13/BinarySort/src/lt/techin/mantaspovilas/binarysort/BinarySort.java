package lt.techin.mantaspovilas.binarysort;

import java.util.Arrays;
import java.util.Random;


public class BinarySort {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] data = new int[5000];
        countTime(data, 1);
//        System.out.print(Arrays.toString(data));
        countTime(data, 2);
        System.out.println();
//        System.out.print(Arrays.toString(data));


    }
    private static void countTime(int[] data, int operationNumber) {
        long start = System.currentTimeMillis();

        switch (operationNumber){
            case 1:
                fillData(data);
                break;
            case 2:
                binarySort(data);
                break;
        }

        long end = System.currentTimeMillis();
        double sec = (end - start) / 1000.0;
        System.out.println("Uzduotis atlikta per " + sec + " sek.");
    }
    private static void binarySort(int[] data) {
        int size = data.length;
        for (int i = 1; i < size; i++) {
            int key = data[i];
            int j = i - 1;
            int pos = binarySearch(data, key, 0, j);
            while(j >= pos){
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    private static int binarySearch(int[] data, int key, int low, int high) {
        if (high <= low) {
            return (key > data[low]) ?
                    (low + 1) : low;
        }
        int mid = (low + high) / 2;
        if (key == data[mid]){
            return mid + 1;
        }
        if (key > data[mid]){
            return binarySearch(data, key,
                    mid + 1, high);
        }
        return binarySearch(data, key, low,
                mid - 1);
    }

    private static void fillData(int[] data) {
        int i = 0;
        while (i < data.length) {
            data[i] = rnd.nextInt(5000000);
            ++i;
        }
    }
}
