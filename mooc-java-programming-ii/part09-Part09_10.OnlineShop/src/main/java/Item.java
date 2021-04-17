/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Item {
    private String name;
    private int quantity;
    private int price;

    public Item(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    
    public int price(){
        return this.price * this.quantity;
    }
    
    public void increaseQuantity(){
        this.quantity += 1;
    }
    
    @Override
    public String toString(){
        return this.name + ": " + this.quantity;
    }
}
