public class main {
    public static void main(String[] args) {
        Greeter greeter = new GreeterExclamationMarkDecorator(new GreeterImpl());
        System.out.println(greeter.greet("Mantas", "po"));

    }
}
