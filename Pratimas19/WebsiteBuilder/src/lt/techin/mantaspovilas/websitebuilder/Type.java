package lt.techin.mantaspovilas.websitebuilder;

public enum Type {
    BUSINESS(150.0, "Joomla"), ECOMMERCE(200.0, "Magento"),
    NEWS(180.0, "Joomla"), LANDING(50.0, "Wordpress"),
    WIKI(40.0, "Wordpress");

    private double price;
    private String cms;

    Type(double price, String cms) {
        this.price = price;
        this.cms = cms;
    }

    public String getCms() {
        return cms;
    }

    public double getPrice() {
        return price;
    }
}
