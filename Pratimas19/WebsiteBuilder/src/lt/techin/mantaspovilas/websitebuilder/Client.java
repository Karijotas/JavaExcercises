package lt.techin.mantaspovilas.websitebuilder;

public class Client {
    public static void main(String[] args) {

        Website wb = new WebsiteBuilder().name("business").type("BUSINESS").build();
        System.out.println(wb);
    }
}
