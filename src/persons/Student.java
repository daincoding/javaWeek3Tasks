package persons;

public class Student extends Person {
    private String joke;

    public Student(String joke) {
        this.joke = joke;
    }

    public void tellJoke() {
        System.out.println(joke);
    }

    @Override
    public void introduce() {
        super.introduce();
        tellJoke();
    }
}
