public class LithuanianGreetingStrategy implements GreeterLanguageStrategy{
    @Override
    public void greet(String firstname, String lastname) {
        System.out.println("Sveikas, "+ firstname +" " + lastname + ", kaip laikaisi?" );
    }
}
