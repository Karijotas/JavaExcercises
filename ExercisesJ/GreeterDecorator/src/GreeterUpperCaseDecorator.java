public class GreeterUpperCaseDecorator extends GreeterImpl {

    private Greeter original;

    public GreeterUpperCaseDecorator(Greeter original) {
        this.original = original;
    }

    @Override
    public String greet(String firstname, String lastname) {
        return null;
    }
}
