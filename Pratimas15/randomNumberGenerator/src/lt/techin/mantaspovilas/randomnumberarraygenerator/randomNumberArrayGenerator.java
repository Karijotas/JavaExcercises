package lt.techin.mantaspovilas.randomnumberarraygenerator;

import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class randomNumberArrayGenerator {

    private int arraySize;

    public randomNumberArrayGenerator(){

    }

    public void generate(int arraysize){
        Random rnd = new Random();
        int[] array = new int[arraysize];
        for (int i = 0; i < arraysize; i++){
            array[i] = rnd.nextInt(100 + 100) - 100;
        }
        System.out.println(Arrays.toString(array));
    }

    public int getArraySize() {
        return arraySize;
    }

    public void setArraySize(int arraySize) {
        this.arraySize = arraySize;
    }
}

