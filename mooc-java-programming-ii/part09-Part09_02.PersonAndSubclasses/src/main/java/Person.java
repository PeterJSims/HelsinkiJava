/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String n, String a){
        this.name = n;
        this.address = a;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString(){
        return this.name + "\n  " + this.address;
    }
}
