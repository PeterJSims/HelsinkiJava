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

public class Herd implements Movable{
    private ArrayList<Movable> items;

    public Herd() {
        this.items = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        items.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for(Movable item: items){
            item.move(dx, dy);
        }
    }
    
    @Override
    public String toString(){
        String str = "";
        for(Movable item: items){
            str += item.toString() + "\n";
        }
        return str;
    }
}
