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

public class ShoppingCart {
    private Map<String, Item> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }
    
    public void add(String product, int price){
        cart.putIfAbsent(product, new Item(product, 0, price));
        cart.get(product).increaseQuantity();
    }
    
    public int price(){
        int price = 0;
        for(Item i: cart.values()){
            price += i.price();
        }
        return price;
    }
    
    public void print(){
        for(Item i: cart.values()){
            System.out.println(i);
        }
    
}
}
