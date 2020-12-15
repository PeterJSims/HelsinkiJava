
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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;
    private int totalWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight + item.getWeight() <= maxWeight) {
            totalWeight += item.getWeight();
            items.add(item);
        }
    }
    
    public int totalWeight(){
        return this.totalWeight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()) return null;
        
        Item heaviest = items.get(0);
        for(Item i: items){
            if (i.getWeight() > heaviest.getWeight()) {
                heaviest = i;
            }
        }
        return heaviest;
    }
    
    public void printItems(){
        items.forEach((i) -> {
            System.out.println(i);
        });
    }

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        }
        String pluralOrSingular = this.items.size() == 1 ? "item" : "items";

        return items.size() + " " + pluralOrSingular + " (" + this.totalWeight + " kg)";

    }

}
