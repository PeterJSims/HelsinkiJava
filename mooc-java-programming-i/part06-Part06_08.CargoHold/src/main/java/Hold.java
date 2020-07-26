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

public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();

    }

    public int totalWeight() {
        int weight = 0;
        for (Suitcase s : suitcases) {
            weight += s.totalWeight();
        }
        return weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.totalWeight() <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }

    public String toString() {
        if (suitcases.isEmpty()) {
            return null;
        }

        return suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems() {
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcases) {
            suitcase.printItems();
        }
    }
}


