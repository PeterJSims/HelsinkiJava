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

public class ChangeHistory {

    private ArrayList<Double> history = new ArrayList<>();

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public double maxValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double max = this.history.get(0);
            for (Double d : history) {
                if (d > max) {
                    max = d;
                }
            }
            return max;
        }
    }

    public double minValue() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double min = this.history.get(0);
            for (Double d : history) {
                if (d < min) {
                    min = d;
                }
            }
            return min;
        }
    }

    public double average() {
        if (this.history.isEmpty()) {
            return 0;
        } else {
            double sum = 0;
            for (Double d : history) {
                sum += d;
            }
            return sum / this.history.size();
        }
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
