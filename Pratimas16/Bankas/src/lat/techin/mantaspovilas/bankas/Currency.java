package lat.techin.mantaspovilas.bankas;

public enum Currency {
    EUR("Eur"), USD("USD");

    private String currency;

    Currency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return this.currency;
    }
}
