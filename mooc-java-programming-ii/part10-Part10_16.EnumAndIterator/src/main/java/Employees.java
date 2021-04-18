
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petersims
 */
public class Employees {

    private List<Person> people;

    public Employees() {
        this.people = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        people.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        Iterator<Person> newPeople = peopleToAdd.iterator();
        while (newPeople.hasNext()) {
            people.add(newPeople.next());
        }

    }

    public void print() {
        Iterator<Person> list = people.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }

    public void print(Education education) {
        Iterator<Person> list = people.iterator();
        while (list.hasNext()) {
            Person tempPerson = list.next();
            if (tempPerson.getEducation().equals(education)) {
                System.out.println(tempPerson);
            }
        }
    }

    public void fire(Education education) {
        Iterator<Person> iter = people.iterator();
        while (iter.hasNext()) {
            Person tempPerson = iter.next();
            if (tempPerson.getEducation() == education) {
                iter.remove();
            }
        }
    }
}
