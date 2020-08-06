/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> warehouse;
    private Map<String, Integer> counts;

    public Warehouse() {
        warehouse = new HashMap<>();
        counts = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        warehouse.put(product, price);
        counts.put(product, stock);
    }

    public int price(String product) {
        return warehouse.getOrDefault(product, -99);
        
    }
    
    public int stock(String product){
        return counts.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(counts.containsKey(product) && counts.get(product) > 0){
            int item = counts.get(product);
            item--;
            counts.put(product, item);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return warehouse.keySet();
    }
}
