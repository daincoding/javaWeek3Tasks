package persons;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Alex");
        person.setAge(30);
        person.setAddress("San Francisco, CA");

        person.introduce();
    }
}
