package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age > 120 || age < 0) {
            throw new IllegalArgumentException("Age must be between 0-120");
        }
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException();
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
