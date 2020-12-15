
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
public class Package {
        private ArrayList<Gift> box;

    public Package() {
        this.box = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        box.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for(Gift g: box){
            totalWeight += g.getWeight();
        }
        return totalWeight;
    }

        
}
