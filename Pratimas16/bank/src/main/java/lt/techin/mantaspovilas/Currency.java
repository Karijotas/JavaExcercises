package lt.techin.mantaspovilas;

import java.math.BigDecimal;
/**
 * Stores currency info
 * EUR stores conversion info from Eur to USD
 * USD stores conversion infro from USD to Eur
 */
public enum Currency {


    EUR("Eur", BigDecimal.valueOf(1.053)), USD("USD", BigDecimal.valueOf(0.944));

    private String currency;
    private BigDecimal conversionRate;

    /**
     * Stores currency name + conversion rate
     * @param currency
     * @param conversionRate
     */
    Currency(String currency, BigDecimal conversionRate) {
        this.currency = currency;
        this.conversionRate = conversionRate;
    }

    public String getCurrency() {
        return this.currency;
    }

    public BigDecimal getConversionRate(){
        return this.conversionRate;
    }
}
