package lat.techin.mantaspovilas.bankas;

import java.math.BigDecimal;

public class Account {
    private String number;
    private String ownerName;
    private String ownerSurname;
    private BigDecimal balance = new BigDecimal(0.0);
    private Currency currency;

    public Account(String ownerName, String ownerSurname, Currency currency) {
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        getBalance();
        this.number = IbanGenerator.generate();
        this.currency = currency;
    }

    public String getIBAN_NUMBER() {
        return number;
    }

    public String getACCOUNT_OWNER() {
        return this.ownerName.concat(" "+ ownerSurname);

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
        }
    }
    public Currency getCurrency(){
        return this.currency;
    }

    @Override
    public String toString() {
        return " Debit account;\n " + "Owner: " + number + ", " + getACCOUNT_OWNER() + ";\n Balance is " + balance + currency + ";";
    }

}
