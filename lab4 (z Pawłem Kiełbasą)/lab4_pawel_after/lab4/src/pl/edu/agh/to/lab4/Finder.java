package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class Finder {
    private final CompositeAggregate compositeAggregate;


    public Finder(CompositeAggregate compositeAggregate) {
     this.compositeAggregate =compositeAggregate;
    }

    public void displayAllSuspectsWithName(String name) {
        ArrayList<Suspect> suspectPeople = new ArrayList<Suspect>();
        Iterator<? extends Suspect> suspectIterator = compositeAggregate.iterator();

        Suspect tempSuspect = null;
        while(suspectIterator.hasNext()){
            tempSuspect = suspectIterator.next();
            if(tempSuspect.getFirstName().equals(name)&& tempSuspect.canBeSuspected()){
                suspectPeople.add(tempSuspect);
                if(suspectPeople.size() >=10) break;
            }
        }
        System.out.println("Znalazlem " + suspectPeople.size() + " pasujacych podejrzanych!");
        for (Suspect sus:suspectPeople) {
            System.out.println(sus.toString());
        }
    }
}
