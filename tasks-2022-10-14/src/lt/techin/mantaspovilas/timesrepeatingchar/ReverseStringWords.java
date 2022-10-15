package lt.techin.mantaspovilas.timesrepeatingchar;

public class ReverseStringWords {
    public static void main(String[] args) {
        String str = "I love Java";
        reverseString(str);
    }

    private static void reverseString(String str) {
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        System.out.println(reverseWord);
    }
}
