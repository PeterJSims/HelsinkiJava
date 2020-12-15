
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
    private int maxWeight;
    private int totalWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            this.totalWeight += suitcase.totalWeight();
            suitcases.add(suitcase);
        }
    }

    public void printItems() {
        suitcases.forEach(sc -> {
           sc.printItems();
        });
    }

    @Override
    public String toString() {
        if (suitcases.isEmpty()) {
            return "no items (0 kg)";
        }
        String pluralOrSingular = this.suitcases.size() == 1 ? "suitcase" : "suitcases";

        return suitcases.size() + " " + pluralOrSingular + " (" + this.totalWeight + " kg)";

    }

}
