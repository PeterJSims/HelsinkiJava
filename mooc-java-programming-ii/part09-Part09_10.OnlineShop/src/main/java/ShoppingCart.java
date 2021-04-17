
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petersims
 */
public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        items.putIfAbsent(product, new Item(product, 0, price));
        items.get(product).increaseQuantity();
    }

    public int price() {
        int totalPrice = 0;
        for (Item item : items.values()) {
            totalPrice += item.price();
        }
        return totalPrice;
    }

    public void print() {
        items.values().forEach((item) -> {
            System.out.println(item);
        });
    }

}
