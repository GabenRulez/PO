package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PersonDatabase implements SuspectAggregate {

    private final Collection<Person> cracovPersons = new ArrayList<Person>();

    public PersonDatabase() {}

    public void generateData() {
        addCracovPerson("Krzysztof", "Mendel", 30);
        addCracovPerson("Pawel", "Pawlowicz", 32);
        addCracovPerson("Janusz", "Programista", 77);
        addCracovPerson("Alicja", "Zaczarowana", 22);
        addCracovPerson("Janusz", "Gimbus", 15);
        addCracovPerson("Tomek", "Gimbus", 14);
        addCracovPerson("Piotr", "Zgredek", 29);
        addCracovPerson("Kasia", "Kosinska", 19);
        addCracovPerson("Janusz", "Mlodociany", 10);
        addCracovPerson("Janusz", "Krakowski", 30);
        addCracovPerson("Jan", "Kowalski", 30);
    }

    public void addCracovPerson(String firstName, String lastName, int age){
        cracovPersons.add(new Person(firstName,lastName,age));
    }

    public Collection<Person> getAllCracovPersons() {
        return cracovPersons;
    }

    @Override
    public Iterator<Suspect> iterator(SearchStrategy searchStrategy){
        return new SuspectIterator(cracovPersons.iterator(),searchStrategy);
    }
}
