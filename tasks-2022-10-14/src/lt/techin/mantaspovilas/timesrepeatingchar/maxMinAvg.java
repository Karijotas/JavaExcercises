package lt.techin.mantaspovilas.timesrepeatingchar;

public class maxMinAvg {
    public static void main(String[] args) {
        int[] arr = {1, -2, 3, 53, -34, 100, 135, -34, -513, 752};

        System.out.println(getMaxFromArray(arr));
        System.out.println(getMinFromArray(arr));
        System.out.println(getAvgFromArray(arr));



    }

    private static double getAvgFromArray(int[] arr) {
        int count = 0;
        double sum = 0.0;
        for (int e: arr) {
            sum += e;
            count++;
        }
        return (sum / count);
    }

    private static int getMinFromArray(int[] arr) {
        int tmp = 0;
        for(int a : arr){
            if (tmp >= a){
                tmp = a;
            }
        }
        return tmp;
    }

    private static int getMaxFromArray(int[] arr) {
        int tmp = 0;
        for(int a : arr){
            if (tmp < a){
                tmp = a;
            }
        }
        return tmp;
    }
}
