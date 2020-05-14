package pl.edu.agh.to.lab4;

import java.util.Calendar;

public class Prisoner extends Suspect {
    private final int judgementYear;

    private final int senteceDuration;

    private final String pesel;

    public Prisoner(String firstName, String lastName, String pesel, int judgementYear, int sentenceDuration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.judgementYear = judgementYear;
        this.senteceDuration = sentenceDuration;
    }

    public String getPesel() {
        return pesel;
    }

    public boolean canBeSuspected() {
        return judgementYear + senteceDuration >= getCurrentYear();
    }

    public int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

}
