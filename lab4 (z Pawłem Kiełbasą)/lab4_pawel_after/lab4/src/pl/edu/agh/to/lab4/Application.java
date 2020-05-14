package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.generateData();

        PrisonersDatabase prisonersDatabase = new PrisonersDatabase();
        prisonersDatabase.generateData();

        StudentDatabase studentDatabase = new StudentDatabase();
        studentDatabase.generateData();

        List<SuspectAggregate> databases = new ArrayList<>();
        databases.add(personDatabase);
        databases.add(prisonersDatabase);
        databases.add(studentDatabase);

        Finder suspects = new Finder(new CompositeAggregate(databases));

        List<SearchStrategy> strategies = new ArrayList<>();
        strategies.add(new NameSearchStrategy("Janusz"));
        strategies.add(new AgeSearchStrategy(77));






    }
}
