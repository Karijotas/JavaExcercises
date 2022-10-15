package lt.techin.mantaspovilas.timesrepeatingchar;

import java.util.Arrays;
import java.util.Random;

public class AddTwoArrays {
    private static Random rnd = new Random();

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(addPlusSortArray(arr1, arr2)));
    }
    private static int[] addPlusSortArray(int[] arr1, int[] arr2) {
        int[] added = new int[arr1.length + arr2.length];
        for (int i = 0; i < added.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                added[j] = arr1[j];
            }
            for (int c = 0; c < arr2.length; c++) {
                added[c + arr1.length] = arr2[c];
            }
        }
        sortQuickSort(added, 0, added.length - 1);
        return added;
    }
    private static void sortQuickSort(int[] data, int low, int high) {
        if (low < high) {
            int pivot = partition(data, low, high);
            sortQuickSort(data, low, pivot - 1);
            sortQuickSort(data, pivot + 1, high);
        }
    }
    private static int partition(int[] data, int low, int high) {
        int pivot = data[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (data[j] <= pivot) {
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
}

