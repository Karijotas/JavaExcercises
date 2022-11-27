package lat.techin.mantaspovilas.bankas;

import java.math.BigDecimal;

public class Exchange {

    public static void exchangeToEuros(BigDecimal amount, Account fromUSD, Account toEur) {
        fromUSD.withdrawMoney(amount);
        System.out.println(" Withdrawed " + amount + fromUSD.getCurrency() + "  from " + fromUSD.getIBAN_NUMBER());
        toEur.depositMoney(amount);
        System.out.println(" Deposited " + amount + toEur.getCurrency() + " to " + toEur.getIBAN_NUMBER());

    }

    public static void exchangeToUSD(BigDecimal amount, Account fromEur, Account toUSD) {
        fromEur.withdrawMoney(amount);
        System.out.println(" Withdrawed " + amount + fromEur.getCurrency() + "  from " + fromEur.getIBAN_NUMBER());
        toUSD.depositMoney(amount);
        System.out.println(" Deposited " + amount + toUSD.getCurrency() + " to " + toUSD.getIBAN_NUMBER());

    }
}
