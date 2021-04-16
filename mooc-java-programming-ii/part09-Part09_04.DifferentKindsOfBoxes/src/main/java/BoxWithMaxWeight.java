
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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(ArrayList<Item> items) {
        int currentWeight = 0;
        for (Item i : items) {
            currentWeight += i.getWeight();
        }
        for (Item i : items) {
            if (currentWeight + i.getWeight() <= maxWeight) {
                items.add(i);
                currentWeight += i.getWeight();
            }
        }
    }

    @Override
    public void add(Item item) {
        int currentWeight = 0;
        for (Item i : items) {
            currentWeight += i.getWeight();
        }
        if (currentWeight + item.getWeight() <= maxWeight) {
            items.add(item);
            currentWeight += item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item i : items) {
            if (i.getName().equals(item.getName())) {
                return true;
            }
        }
        return false;

    }

}
