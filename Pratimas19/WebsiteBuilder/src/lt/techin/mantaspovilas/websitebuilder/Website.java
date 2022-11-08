package lt.techin.mantaspovilas.websitebuilder;

public  class Website {

    private String name;
    private Type type;

    public Website(WebsiteBuilder websiteBuilder) {
        this.name = websiteBuilder.getName();
        this.type = websiteBuilder.getType();
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", type=" + type + '\'' +
                ", price= " + type.getPrice() + '\'' +
                ", CMS= " + type.getCms() +
                '}';
    }
}
