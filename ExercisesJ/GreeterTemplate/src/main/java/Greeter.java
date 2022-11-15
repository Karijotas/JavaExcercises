public abstract class Greeter {
    public void greet(String firstname, String lastname){
        System.out.println(getGreetingString()+firstname+" " + lastname);
    }

    protected abstract String getGreetingString();

}
