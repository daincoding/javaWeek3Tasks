package persons;

import org.w3c.dom.ls.LSOutput;

public class Person {
    private String name;
    private int age;
    private String address;

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    //endregion

    public void introduce() {
        System.out.println("Hey! My name is " + name + " and I am " + age + " years old. I currently live in " + address + ".");
    }
}
