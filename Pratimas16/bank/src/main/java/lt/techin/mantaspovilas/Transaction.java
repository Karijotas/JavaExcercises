package lt.techin.mantaspovilas;

import java.math.BigDecimal;

public class Transaction {

    /**
     * Transaction from Euros to US Dollars
     * @param amount
     * @param fromUSD
     * @param toEur
     */
    public static void transferToUSD(BigDecimal amount, Account fromUSD, Account toEur) {
        fromUSD.withdrawMoney(amount);
        System.out.println(" Withdrawed " + amount + fromUSD.getCurrency() + "  from " + fromUSD.getIBAN_NUMBER());
        BigDecimal converted = amount.multiply(Currency.USD.getConversionRate());
        toEur.depositMoney(converted);
        System.out.println(" Deposited " + converted + toEur.getCurrency() + " to " + toEur.getIBAN_NUMBER());
    }

    /**
     * Transaction from US Dollars to Euros
     * @param amount
     * @param fromEur
     * @param toUSD
     */
    public static void transferToEur(BigDecimal amount, Account fromEur, Account toUSD) {
        fromEur.withdrawMoney(amount);
        System.out.println(" Withdrawed " + amount + fromEur.getCurrency() + "  from " + fromEur.getIBAN_NUMBER());
        BigDecimal converted = amount.multiply(Currency.USD.getConversionRate());
        toUSD.depositMoney(converted);
        System.out.println(" Deposited " + converted + toUSD.getCurrency() + " to " + toUSD.getIBAN_NUMBER());

    }
}
