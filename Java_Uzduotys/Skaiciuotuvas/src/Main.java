import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple calculator");
        System.out.println("Enter the type of calculation: +, -, * or / ");
        String calc = scanner.nextLine();
        System.out.println("Enter the first number: ");
        double num1 = Double.valueOf(scanner.nextLine());
        System.out.println("Enter the second number: ");
        double num2 = Double.valueOf(scanner.nextLine());



        if (calc.equals("+")) {
            System.out.println(num1 +" + "+ num2+ " = "+ (num1+num2) );
        }

        if (calc.equals("-")) {
            System.out.println(num1 +" - "+ num2+ " = "+ (num1-num2) );
        }

        if (calc.equals("*")) {
            System.out.println(num1 +" * "+ num2+ " = "+ (num1*num2) );
        }

        if (calc.equals("/")) {
            System.out.println(num1 +" / "+ num2+ " = "+ (num1/num2) );
        }

        if (calc.isEmpty()){
            System.out.println("Not recognized");
        }
    }
}