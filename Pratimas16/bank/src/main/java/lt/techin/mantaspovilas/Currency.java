package lt.techin.mantaspovilas;

import java.math.BigDecimal;

public enum Currency {
    EUR("Eur", BigDecimal.valueOf(1.053)), USD("USD", BigDecimal.valueOf(0.944));

    private String currency;
    private BigDecimal conversionRate;


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
