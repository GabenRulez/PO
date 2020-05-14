package pl.edu.agh.to.lab4;

public abstract class Suspect {
    protected String firstName;
    protected String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName+" "+lastName;
    }

    public abstract boolean canBeSuspected();
}
