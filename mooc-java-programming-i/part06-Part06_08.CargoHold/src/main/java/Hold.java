
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
public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + totalWieght() <= maximumWeight) {
            suitcases.add(suitcase);
        }
    }

    public int totalWieght() {
        int sumWeight = 0;
        for (Suitcase suitcase : suitcases) {
            sumWeight += suitcase.totalWeight();
        }
        return sumWeight;
    }

    public void printItems() {
        suitcases.forEach((suitcase) -> {
            suitcase.printItems();
        });
    }

    @Override
    public String toString() {
        return suitcases.size() + " suitcases (" + totalWieght() + " kg)";
    }
}
