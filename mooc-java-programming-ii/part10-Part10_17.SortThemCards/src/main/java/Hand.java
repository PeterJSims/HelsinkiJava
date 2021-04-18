
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author petersims
 */
public class Hand implements Comparable<Hand>{

    private List<Card> hand;

    public Hand() {
        this.hand = new ArrayList<>();
    }

    public void add(Card card) {
        hand.add(card);
    }

    public void print() {
        Iterator<Card> list = hand.iterator();
        while (list.hasNext()) {
            System.out.println(list.next());
        }
    }
    
    public void sort(){
        Collections.sort(hand);
    }
    
    public void sortBySuit(){
        Collections.sort(hand, new BySuitInValueOrder());
    }
    

    public int handValue(){
        return this.hand.stream()
                .map(c -> c.getValue())
                .reduce(0,(c1, c2) -> c1 + c2);
    }

    @Override
    public int compareTo(Hand o) {
        return this.handValue() - o.handValue();
    }
}
