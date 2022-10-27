package lt.techin.mantaspovilas.findprimes;

public class findPrimes {


//    public static void findPrimesIn(int startingNumber, int finalNumber) {
//
//
//        while (startingNumber < finalNumber) {
//            int number = startingNumber;
//            boolean is = false;
//            int i = 2;
//            while (i <= number / 2) {
//                if (number % i == 0) {
//                    is = true;
//                }
//
//                i++;
//
//            }
//            startingNumber++;
//            if (!is) {
//                System.out.print(startingNumber -1 + ", ");
//            } else {
//                System.out.print("");
//            }
//        }
//    }

    public static int[] countPrimeNumbers(int start, int end) {
        if (start < 0 || end < 0 || end < start) {
            throw new IllegalArgumentException();
        } else {
            int[] primeNumbers = new int[end - start];
            boolean isPrime = true;
            int count = 0;
            for (int i = start; i <= end; i++) {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {

                    primeNumbers[count] = i;
                    count++;

                }
                isPrime = true;
            }
            int[] prime = new int[count];
            for (int i = 0; i < prime.length; i++) {
                if (primeNumbers[i] != 0) {
                    prime[i] = primeNumbers[i];
                }
            }
            return prime;
        }
    }

}

