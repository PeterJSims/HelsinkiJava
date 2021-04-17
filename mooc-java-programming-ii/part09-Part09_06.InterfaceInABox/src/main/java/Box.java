
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
public class Box implements Packable {

    private ArrayList<Packable> items;
    final private double maximumCapacity;

    public Box(double maximumCapacity) {
        this.items = new ArrayList<>();
        this.maximumCapacity = maximumCapacity;
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() <= 10.0) {
            items.add(item);
        }
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for (Packable i : items) {
            weight += i.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }

}
