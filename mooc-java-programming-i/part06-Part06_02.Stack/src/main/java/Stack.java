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
public class Stack {
    ArrayList<String> values = new ArrayList<>();
    
    public Stack(){
        this.values = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.values.isEmpty();
    }
    
    public void add(String value){
        values.add(value);
    }
    
    public ArrayList<String> values(){
        return this.values;
    }
    
    public String take(){
        if(values.size() > 0){
            return this.values.remove(this.values.size() - 1);
        }
        return "";
    }
}
