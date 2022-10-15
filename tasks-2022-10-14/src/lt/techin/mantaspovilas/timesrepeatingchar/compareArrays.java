package lt.techin.mantaspovilas.timesrepeatingchar;

import java.util.Arrays;

public class compareArrays {
    public static void main(String[] args) {
        String[] arr1 = {"Parašykite","programą","kuri", "patikrintų", "ar", "du", "String", "tipo", "masyvai", "yra", "lygūs"};
        String[] arr2 = {"Parašykite","proramą","kuri", "patikrintų", "ar", "du", "String", "tipo", "masyvai", "yra", "lygūs"};

        System.out.println(compareTwoArrays(arr1, arr2));
    }

    private static boolean compareTwoArrays(String[] arr1, String[] arr2) {
       if( Arrays.toString(arr1).equals(Arrays.toString(arr2))){
            return true;
        }
       return false;

    }
}
