package lt.techin.mantaspovilas.maziausias;

public class Maziausias {
    public static void main(String[] args) {
        int[] masyvas = {2,5,-8,4,2,3};
        int n = masyvas.length;
        System.out.println(getSmallest(masyvas, n));
    }

    private static int getSmallest(int[] masyvas, int length) {
        /// Method not mine
        if(length == 1)
            return masyvas[0];

        return Math.min(masyvas[length-1], getSmallest(masyvas, length-1));
    }

}
