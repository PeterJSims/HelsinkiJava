
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Pipe<T> {
    private ArrayList<T> pipe;

    public Pipe() {
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        pipe.add(value);
    }
    
    public T takeFromPipe(){
        if (this.isInPipe()){
            T temp = pipe.get(0);
            pipe.remove(0);
            return temp;
        } else {
            return null;
        }
    }
    
    public boolean isInPipe(){
        return !(pipe.isEmpty());
    }
    
    
}
