package lt.techin.mantaspovilas.converttohex;

public class ConvertToHex {

    String charToHex;
    public ConvertToHex(){
    }

    public void converter(String str){
        StringBuilder sb = new StringBuilder();

        char[] arr = str.toCharArray();

        for (char c : arr){
            charToHex = Integer.toHexString(c);
            sb.append(charToHex);
        }

        System.out.println(sb.toString());
    }
}
