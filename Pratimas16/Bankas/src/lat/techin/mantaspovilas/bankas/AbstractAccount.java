package lat.techin.mantaspovilas.bankas;

import java.math.BigDecimal;

public class AbstractAccount {



    private final String IBAN_NUMBER = IbanGenerator.generate();
    private BigDecimal balance = new BigDecimal(0.0);

    public BigDecimal getBalance() {
        return balance;
    }

    public void withdraw(double amount){
        BigDecimal newbalance = balance.subtract(BigDecimal.valueOf(amount));
        if (newbalance.signum() == 1){
            this.balance = newbalance.subtract(BigDecimal.valueOf(amount));
        } else {
            System.out.println("Not enough money to withdraw!");
        }


    }
    @Override
    public String toString() {
        return "AbstractAccount{" +
                "IBAN_NUMBER='" + IBAN_NUMBER + '\'' +
                ", balance=" + balance +
                '}';
    }

}
