public class EnglishGreetingStrategy implements GreeterLanguageStrategy{

    @Override
    public void greet(String firstname, String lastname) {
        System.out.println("Hi "+ firstname + " " + lastname + ", how are you?");
    }
}
