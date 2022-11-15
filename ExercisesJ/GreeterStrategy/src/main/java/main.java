public class main {
    public static void main(String[] args) {
        Greeter greeter = new Greeter(new LithuanianGreetingStrategy());

        greeter.greet("Mantas", "Povilas");
        greeter.changeStrategy(new EnglishGreetingStrategy());
        greeter.greet("Mantas", "Povilas");

    }
}
