package lt.techin.mantaspovilas.timesrepeatingchar;

import java.util.Arrays;
import java.util.Random;

public class AddToDoubleArrayByIndex {
    private static Random rnd = new Random();
    public static void main(String[] args) {
        double[] arr = new double[10];
        fillArray(arr);
        System.out.println(Arrays.toString(arr));
        addToArrayByIndex(arr, 4, 1000.54);
        System.out.println(Arrays.toString(arr));
    }
    private static double[] addToArrayByIndex(double[] arr, int index, double value) {
        double[] temp = new double[arr.length - 1];
        for (int i = 0; i <= arr.length; i++) {
            if (i == index) {
                arr[i] = value;
            }
        }
        return arr;
    }
    private static void fillArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(124);
        }
    }
}
