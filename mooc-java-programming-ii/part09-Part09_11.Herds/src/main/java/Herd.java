
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
public class Herd implements Movable {

    private ArrayList<Movable> herdMembers;

    public Herd() {
        this.herdMembers = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        this.herdMembers.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        herdMembers.forEach((m) -> {
            m.move(dx, dy);
        });
    }
    
    @Override 
    public String toString(){
        String herdString = "";
        for (Movable m: herdMembers){
            herdString += (m.toString() + "\n");
        }
        return herdString;        
    }

}
