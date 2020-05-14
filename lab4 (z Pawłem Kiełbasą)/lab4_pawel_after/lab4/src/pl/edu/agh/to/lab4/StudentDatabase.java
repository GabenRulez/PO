package pl.edu.agh.to.lab4;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDatabase implements SuspectAggregate {
    public  final Collection<Student> students = new ArrayList<Student>();

    public  StudentDatabase(){}

    public void addStudent(String firstName, String lastName, String index){
        students.add(new Student(firstName, lastName, index));
    }
    public void generateData(){
        addStudent("Stefan", "Dyta","768261");
        addStudent("yuq","yqkqyui","775684");
        addStudent("yatfyqt","uadjnd","738921");
        addStudent();
    }
}
