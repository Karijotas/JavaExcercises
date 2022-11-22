public class GreeterExclamationMarkDecorator extends GreeterImpl{
    private Greeter original;

    public GreeterExclamationMarkDecorator(Greeter original) {
        this.original = original;
    }

    @Override
    public String greet(String firstname, String lastname) {
        return "Sveikas, "+ firstname + "! "+ lastname + "!, malonu susipažinti";
    }
}
