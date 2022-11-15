public class Greeter {
    private GreeterLanguageStrategy greeter;

    public Greeter(GreeterLanguageStrategy greeter) {
        this.greeter = greeter;
    }

    public void greet(String firstname, String lastname) {
        greeter.greet(firstname, lastname);
    }

    public void changeStrategy(GreeterLanguageStrategy strategy) {
        this.greeter = strategy;
    }
}
