package lat.techin.mantaspovilas.bankas;

import java.math.BigDecimal;

public class AbstractAccount {



    private final String IBAN_NUMBER = IbanGenerator.generate();
    private BigDecimal balance = new BigDecimal(0.0);

    public BigDecimal getBalance() {
        return balance;
    }
    @Override
    public String toString() {
        return "AbstractAccount{" +
                "IBAN_NUMBER='" + IBAN_NUMBER + '\'' +
                ", balance=" + balance +
                '}';
    }

}
