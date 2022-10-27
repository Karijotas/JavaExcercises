package lt.techin.mantaspovilas.converttohex;

public class ConvertToHex {



    public static String converter(String str){
        StringBuilder sb = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char c : arr){
            sb.append(Integer.toHexString(c));
        }
        return sb.toString();
    }
}
