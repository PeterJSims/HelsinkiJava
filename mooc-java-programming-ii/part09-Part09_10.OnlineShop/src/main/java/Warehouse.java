
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petersims
 */
public class Warehouse {

    private Map<String, Integer> prices;
    private Map<String, Integer> stock;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stock.put(product, stock);
    }

    public int price(String product) {
        return this.prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return this.stock.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        if(!stock.containsKey(product) || stock.get(product) <= 0){
            return false;
        } else {
            stock.put(product, stock.get(product) - 1);
            return true;
        }
    }
    
    public Set<String> products() {
        Set<String> productSet = new HashSet<>();
        for (String item: stock.keySet()){
            if (stock.get(item) > 0){
                productSet.add(item);
            }
        }
        return productSet;
    }

}
