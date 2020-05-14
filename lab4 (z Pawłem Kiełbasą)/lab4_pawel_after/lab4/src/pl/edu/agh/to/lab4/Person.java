package pl.edu.agh.to.lab4;

public class Person extends Suspect {
     private int age;

    public Person(String firstname, String lastname, int age) {
        this.age = age;
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean canBeSuspected() {
        return age>18;
    }
}
