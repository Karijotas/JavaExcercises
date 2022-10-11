package lt.techin.mantaspovilas.fibonacci;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.valueOf(scanner.nextLine());
        long start = System.currentTimeMillis();
        System.out.println("Fibonacci number of "+number+" : "+fib(number));
        long end = System.currentTimeMillis();
        System.out.println(end-start +"ms");
    }
    private static BigDecimal fib(int i) {
        BigDecimal f1 = BigDecimal.valueOf(0);
        BigDecimal f2 = BigDecimal.valueOf(1);
        BigDecimal f = BigDecimal.valueOf(0);
        for (int c = 1; c<i; c++){
            f = f1.add(f2);
            f1 = f2;
            f2 = f;

        }
        return f;
    }
}


