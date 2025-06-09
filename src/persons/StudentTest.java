package persons;

public class StudentTest {
    public static void main(String[] args) {
     Student max = new Student("I like numbers in Java - aren't they int-eresting?!");

     max.setName("Max");
     max.setAge(23);
     max.setAddress("Istanbul");

     //Inherited
     max.introduce();
     //Student Method
     //max.tellJoke();
    }
}
