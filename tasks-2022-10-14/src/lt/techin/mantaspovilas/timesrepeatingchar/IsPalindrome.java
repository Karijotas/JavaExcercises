package lt.techin.mantaspovilas.timesrepeatingchar;

public class IsPalindrome {
    public static void main(String[] args) {
        String st = "saippuakivikauppias";
        System.out.println("Is the string "+ st + " a palindrome?");
        System.out.println( isItAPalindrome(st));

    }

    private static boolean isItAPalindrome(String st) {
        String reversed = reverseString(st);
        if(st.equals(reversed)){
            return true;
        } else {
            return false;
        }
    }

    private static String reverseString(String str) {
        String reversed = "";
        char tmp = 'a';
        for (int i = 0; i < str.length(); i++) {
            tmp = str.charAt(i);
            reversed = tmp + reversed;
        }
        return reversed;

    }

}
