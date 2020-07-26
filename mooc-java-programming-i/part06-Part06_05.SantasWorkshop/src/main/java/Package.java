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
public class Package {
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package(){
        this.gifts = new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int sum = 0;
        for(Gift g: gifts){
            sum += g.getWeight();
        }
        return sum;
    }
}
