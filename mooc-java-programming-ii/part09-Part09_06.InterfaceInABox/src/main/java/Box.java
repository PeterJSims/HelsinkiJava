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


public class Box implements Packable {
    private double maxweight;
    private ArrayList<Packable> items = new ArrayList<>();

    public Box(double maxweight) {
        this.maxweight = maxweight;
    }
    
    public void add(Packable item){
        if(item.weight() + this.weight() < maxweight){
            items.add(item);
        }
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(Packable i: items){
            weight += i.weight();
        }
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }
}
