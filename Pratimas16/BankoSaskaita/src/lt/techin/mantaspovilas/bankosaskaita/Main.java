package lt.techin.mantaspovilas.bankosaskaita;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jonas");

        System.out.println(account.getBalance());
        account.depositMoney(BigDecimal.valueOf(13));
        account.depositMoney(BigDecimal.valueOf(4219.0));
        System.out.println(account.getBalance());
        account.withdrawMoney(BigDecimal.valueOf(50.0));
        System.out.println(account.getBalance());
        System.out.println(account.getIBAN_NUMBER() + " " + account.getACCOUNT_OWNER());

        Account account1 = new Account("Petras");
        System.out.println(account1.getBalance());
        account1.depositMoney(BigDecimal.valueOf(13));
        account1.depositMoney(BigDecimal.valueOf(4219.0));
        System.out.println(account1.getBalance());
        account1.withdrawMoney(BigDecimal.valueOf(50.0));
        System.out.println(account1.getBalance());
        System.out.println(account1.getIBAN_NUMBER() + " " + account1.getACCOUNT_OWNER());
    }
}
