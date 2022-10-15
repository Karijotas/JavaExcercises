package lt.techin.mantaspovilas.timesrepeatingchar;

import java.util.Arrays;

public class TimesRepeatingChar {
    private final static int MAX_CHAR_NUMBER = 256;
    public static void main(String[] args) {
        String str = "I love Java";
        countDuplicates(str);
    }

    private static void countDuplicates(String str) {
        int[] emptyCharArray = new int[MAX_CHAR_NUMBER];
        countChars(str, emptyCharArray);
        for (int i = 0; i < MAX_CHAR_NUMBER; i++){
            if(emptyCharArray[i] >= 1){
                System.out.printf("%c -> %d",i,emptyCharArray[i]);
                System.out.println();
            }
        }
    }

    private static void countChars(String str, int[] emptyCharArray) {

        for (int i = 0; i< str.length(); i++){
            emptyCharArray[str.charAt(i)]++;
        }
    }
}