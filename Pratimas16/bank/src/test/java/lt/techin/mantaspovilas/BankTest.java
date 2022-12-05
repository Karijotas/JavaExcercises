package lt.techin.mantaspovilas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * Unit test for simple App.
 */
public class BankTest
{

        /**
     * Rigorous Test :-)
     */

        Account debitAccount = new Account("Tester", "Tester", Currency.EUR);
        Account creditAccount = new CreditAccount("Testas", "Testavicius", Currency.USD, BigDecimal.valueOf(1000));
    @Test
    public void shouldGenerateRandomIBAN()
    {
        assertTrue("Should generate a random IBAN number", IbanGenerator.generate() != IbanGenerator.generate());
        assertFalse("Should generate a random IBAN number", IbanGenerator.generate() == IbanGenerator.generate());
    }

    @Test
    public void shouldCreateAccountWithZeroBalance(){
        assertTrue("Account balance should be zero", debitAccount.getBalance().equals(BigDecimal.ZERO));
        assertTrue("Account balance should be zero", creditAccount.getBalance().equals(BigDecimal.ZERO));
    }
}
