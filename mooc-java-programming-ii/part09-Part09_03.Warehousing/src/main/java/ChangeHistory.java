
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petersims
 */
public class ChangeHistory {

    private ArrayList<Double> changes;

    public ChangeHistory() {
        this.changes = new ArrayList<>();
    }

    public void add(double status) {
        changes.add(status);
    }

    public void clear() {
        this.changes = new ArrayList<>();
    }

    @Override
    public String toString() {
        return changes.toString();
    }

    public double maxValue() {
        if (changes.isEmpty()) {
            return 0;
        } else {
            return Collections.max(changes);
        }
    }

    public double minValue() {
        if (changes.isEmpty()) {
            return 0;
        } else {
            return Collections.min(changes);
        }
    }

    public double average() {
        if (changes.isEmpty()) {
            return 0;
        } else {
            double sum = 0.0;
            for (Double num : changes) {
                sum += num;
            }
            return sum / changes.size();
        }
    }
    
    

}
