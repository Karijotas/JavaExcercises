package lt.techin.mantaspovilas.findprimes;

public class findPrimes {

    private int startingNumber;
    private int finalNumber;

    public findPrimes() {

    }

    public void findPrimesIn(int startingNumber, int finalNumber) {


        while (startingNumber < finalNumber) {
            int number = startingNumber;
            boolean is = false;
            int i = 2;
            while (i <= number / 2) {
                if (number % i == 0) {
                    is = true;
                }

                i++;

            }
            startingNumber++;
            if (!is) {
                System.out.print(startingNumber -1 + ", ");
            } else {
                System.out.print("");
            }
        }
    }
}

