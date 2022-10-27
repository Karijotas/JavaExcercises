package lt.techin.mantaspovilas.bankosaskaita;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();

        System.out.println(account.getBalance());
        account.depositMoney(BigDecimal.valueOf(13));
        account.depositMoney(BigDecimal.valueOf(4219.0));
        System.out.println(account.getBalance());
        account.withdrawMoney(BigDecimal.valueOf(50.0));
        System.out.println(account.getBalance());
    }
}
