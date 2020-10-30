
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
public class Stack {

    public ArrayList<String> items;

    public Stack() {
        this.items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void add(String value) {
        items.add(value);
    }

    public ArrayList<String> values() {
        return items;
    }

    public String take() {
        int last = items.size() - 1;
        String value = items.get(last);
        items.remove(last);
        return value;
    }

}
