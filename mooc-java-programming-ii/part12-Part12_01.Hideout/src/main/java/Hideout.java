/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Hideout<T> {
    private T hiddenItem;

    public Hideout() {
        this.hiddenItem = null;
    }
    
    public void putIntoHideout(T toHide){
        this.hiddenItem = toHide;
    }
    
    public T takeFromHideout(){
        if(hiddenItem == null) return null;
        T temp = hiddenItem;
        hiddenItem = null;
        return temp;
    }
    
    public boolean isInHideout(){
        return !(hiddenItem == null);
    }
    
}
