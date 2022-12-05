package lt.techin.mantaspovilas;

import java.math.BigDecimal;



public class Main {
    public static void main(String[] args) {

        Account account = new Account("Jonas", "Plečkaitis", Currency.EUR);

        System.out.println(account);
        System.out.println("");
        account.depositMoney(BigDecimal.valueOf(135.43));
        System.out.println("");
        System.out.println(account);
        System.out.println("");
        account.withdrawMoney(BigDecimal.valueOf(140));
        System.out.println("");
        System.out.println(account);
        System.out.println("");
        Account account1 = new CreditAccount("Jonas", "Petraitis", Currency.USD, BigDecimal.valueOf(700));

        System.out.println(account1);
        System.out.println("");
        account1.depositMoney(BigDecimal.valueOf(31));
        System.out.println("");
        Transaction.transferToEur(BigDecimal.valueOf(30), account1, account);
        System.out.println("");
        System.out.println(account);
        System.out.println("");
        System.out.println(account1);
    }
}
