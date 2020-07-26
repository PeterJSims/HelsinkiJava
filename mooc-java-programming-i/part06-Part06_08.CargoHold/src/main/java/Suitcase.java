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

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            items.add(item);
        }

    }
    
    public Item heaviestItem(){
        if(this.items.isEmpty()){
            return null;
        }
        Item heaviest = items.get(0);
        for(Item i: items){
            if(i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)\n");
        }
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        } else if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + "kg)";
        }
        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }

}
