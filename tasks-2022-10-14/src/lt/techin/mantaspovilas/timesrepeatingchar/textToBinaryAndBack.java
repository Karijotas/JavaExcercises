package lt.techin.mantaspovilas.timesrepeatingchar;

public class textToBinaryAndBack {
    public static void main(String[] args) {
        String st = "Kasdien Miegu pirmas eglėje";
        convertStringToBinary(st);

//        StringBuilder sb = new StringBuilder();
//
//        char[] chars = st.toCharArray();
//        for (char c : chars) {
//            String binary = Integer.toBinaryString(c);
//            String formatted = String.format("%8s", binary);
//            String output = formatted.replaceAll(" ", "0");
//            sb.append(output);
//            sb.append(" ");
//        }
//
//        System.err.println(sb.toString());



    }

    private static void convertStringToBinary(String st) {
        StringBuilder result = new StringBuilder();
        char[] chars = st.toCharArray();
        for (char oneChar : chars){
            String binary = Integer.toBinaryString(oneChar);
            String formatted = String.format("%16s", binary);
            String output = formatted.replaceAll(" ", "0");
            result.append(output).append(" ");
        }
        System.out.println(result);
    }

}
