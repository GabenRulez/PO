package pl.edu.agh.to.lab4;

public class Student extends Suspect {
    private String index;

    public Student(String firstName, String lastName, String index){
        this.firstName=firstName;
        this.lastName=lastName;
        this.index=index;
    }

    public String getIndex() {
        return index;
    }

    @Override
    public boolean canBeSuspected() {
        return true;
    }
}
