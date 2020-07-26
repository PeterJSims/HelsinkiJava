/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
import java.util.ArrayList;
public class Room {
    private ArrayList<Person>persons = new ArrayList<>();
    
    public Room(){
        this.persons = new ArrayList<>();
    }
    
    public void add(Person person){
        persons.add(person);
    }
    
    public boolean isEmpty(){
        return this.persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.persons;
    }
    
    public Person shortest(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = persons.get(0);
        
        for(Person p: persons){
            if(p.getHeight() < shortest.getHeight()){
                shortest = p;
            }
        }
        return shortest;
    }
    
    public Person take(){
        if(persons.isEmpty()){
            return null;
        }
        Person shortest = shortest();
        this.persons.remove(shortest);
        return shortest;
    }
}
