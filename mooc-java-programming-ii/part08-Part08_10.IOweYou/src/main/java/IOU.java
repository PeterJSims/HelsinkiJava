
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class IOU {
    private HashMap<String, Double>ious;

    public IOU() {
        this.ious = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        ious.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.ious.getOrDefault(toWhom, 0.0);
    }
    
}
