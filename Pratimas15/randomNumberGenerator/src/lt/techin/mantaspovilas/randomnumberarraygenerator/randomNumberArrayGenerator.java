package lt.techin.mantaspovilas.randomnumberarraygenerator;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class randomNumberArrayGenerator {
    private static final Random rnd = new Random();

    public static int[] generate(int arraysize){
        int[] array = new int[arraysize];
        for (int i = 0; i < arraysize; i++){
            array[i] = rnd.nextInt(100 + 100) - 100;
        }
        return array;
    }

}

