public class Main {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        String op = args[1];
        double b = Double.parseDouble(args[2]);
        double c=0;


         if   (op.equals("+")) {
                c = a + b;
            }else if (op.equals("-")) {
                c = a - b;
            } else if (op.equals("*")) {
                c = a * b;
            } else if (op.equals("/")) {
                c = a / b;
            } else {
                System.out.println("Operator not recognized");
            }

        System.out.println(c);

    }
}