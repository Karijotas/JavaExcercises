package lt.techin.mantaspovilas.timesrepeatingchar;

public class Atkoduoti {
    public static void main(String[] args) {
        int[] arr = {71, 101, 114, 196, 133, 32, 103, 105, 114, 196, 133, 32, 103, 101, 114, 111, 106, 32, 103, 105, 114, 105, 111, 106, 32, 103, 196, 151, 114, 196, 151, 109};
        decode(arr);
    }

    private static void decode(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int asciiVal = arr[i];
            String str = Character.toString((char) asciiVal);
            System.out.print(str);
        }
    }

}



