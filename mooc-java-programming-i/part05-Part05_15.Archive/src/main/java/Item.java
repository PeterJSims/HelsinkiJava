/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Item {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        
        if(!(obj instanceof Item)) return false;
    
        
        Item i = (Item) obj;
        
        return this.id.equals(i.id);
    }
    
    @Override
    public String toString(){
        return this.id + ": " + this.name;
    }
    
}
