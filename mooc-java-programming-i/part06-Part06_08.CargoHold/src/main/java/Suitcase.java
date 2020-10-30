
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

    private int maxWeight;
    private ArrayList<Item> items;
    private int currentWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.currentWeight = 0;
    }

    public void addItem(Item item) {
        if (this.currentWeight + item.getWeight() <= maxWeight) {
            currentWeight += item.getWeight();
            items.add(item);
        }
    }
    
    public void printItems(){
        items.forEach((i) -> {
            System.out.println(i);
        });
    }
    
    public int totalWeight(){
        return currentWeight;
    }
    
    public Item heaviestItem(){
        if(items.isEmpty()) return null;
        Item heaviest = items.get(0);
        for(Item i : items){
            if(i.getWeight() > heaviest.getWeight()){
                heaviest = i;
            }
        }
        return heaviest;
        
    }
    

    @Override
    public String toString() {
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return items.size() + " item (" + currentWeight + " kg)";
        } else {
            return items.size() + " items (" + currentWeight + " kg)";
        }
    }
}
