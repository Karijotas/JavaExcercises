package lt.techin.mantaspovilas.bankosaskaita;

import java.math.BigDecimal;

public class Account {
    private static String number;
    private String owner;
    private BigDecimal balance = new BigDecimal(0.0);

    public Account(String owner) {
        this.owner = owner;
        getBalance();
        number = IbanGenerator.generate();
    }

    public String getIBAN_NUMBER() {
        return number;
    }

    public String getACCOUNT_OWNER() {
        return this.owner;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void depositMoney(BigDecimal money) {
        BigDecimal newBalance = balance.add(money);
        this.balance = newBalance;
    }

    public void withdrawMoney(BigDecimal money) {
        BigDecimal newBalance = balance.subtract(money);
        if (newBalance.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Not enough money!");
        } else {
            this.balance = newBalance;
            System.out.println("Withdrawed "+ money + " amount of money from your account");
        }
    }
}
