package lt.techin.mantaspovilas.timesrepeatingchar;

import java.util.Arrays;
import java.util.Collections;


public class ApverstasTekstas {
    public static void main(String[] args) {
        String str = "I love Java";
        reverseString(str);
    }

    private static void reverseString(String str) {
       if (str == null || str.isEmpty()){
           System.out.println("No text here...");
       } else{
           String reversed = "";
           char tmp = 'a';
           for (int i = 0; i < str.length(); i++) {
               tmp = str.charAt(i);
               reversed = tmp + reversed;
           }
           System.out.println(reversed);
       }
    }
}


