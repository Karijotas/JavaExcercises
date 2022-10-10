package lt.techin.mantaspovilas.sumavidurkis;

public class SumaVidurkis {
    public static void main(String[] args) {
        int[] masyvas = {2, 5, 8, 4, 2, 3};

        System.out.println(getSum(masyvas));
        System.out.println(getAverage(masyvas));
    }

    private static String  getSum(int[] masyvas) {
        int suma = 0;
        for  (int each : masyvas){
            suma += each;
        }
        return "Masyvo elementų suma: " + suma;
    }

    private static String getAverage(int[] masyvas) {
        int suma = 0;
        int count = 0;
        int avg = 0;
        for  (int each : masyvas){
            suma += each;
            ++count;
        }
        avg = suma /count;
        return "Masyvo elementų vidurkis: "+ avg;

    }


}