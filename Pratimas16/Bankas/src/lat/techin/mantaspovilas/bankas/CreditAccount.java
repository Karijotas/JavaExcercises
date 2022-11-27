package lat.techin.mantaspovilas.bankas;

import java.math.BigDecimal;

public class CreditAccount extends Account {

    private BigDecimal limit;

    public CreditAccount(String ownerName, String ownerSurname, Currency currency, BigDecimal limit) {
        super(ownerName, ownerSurname, currency);
        this.limit = limit;
    }

    @Override
    public String getIBAN_NUMBER() {
        return super.getIBAN_NUMBER();
    }

    @Override
    public String getACCOUNT_OWNER() {
        return super.getACCOUNT_OWNER();
    }

    @Override
    public BigDecimal getBalance() {
        return super.getBalance();
    }

    @Override
    public void depositMoney(BigDecimal money) {
        super.depositMoney(money);
    }

    @Override
    public void withdrawMoney(BigDecimal money) {
        super.withdrawMoney(money);
    }

    @Override
    public Currency getCurrency() {
        return super.getCurrency();
    }

    @Override
    public String toString() {
        return " Credit account;\n " + "Owner: " + getIBAN_NUMBER() + ", " + getACCOUNT_OWNER() +
                ";\n Balance is " + getBalance() + getCurrency() + ";";
    }
}
