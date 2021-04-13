/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class Container {
    private int bucket;
    
    public Container() {
        this.bucket = 0;
    }
    
    public int contains(){
        return this.bucket;
    }
    
    public void add(int amount){
        if (amount > 0){
            if (this.bucket + amount > 100){
                this.bucket = 100;
            } else {
                this.bucket += amount;
            }
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            if (this.bucket - amount < 0) {
                this.bucket = 0;
            }  else {
                this.bucket -= amount;
            }
        }
    }
    
    @Override
    public String toString() {
        return this.bucket + "/100";
    }
    
    
    
}
