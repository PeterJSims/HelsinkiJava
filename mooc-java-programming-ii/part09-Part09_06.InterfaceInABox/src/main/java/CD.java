/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
public class CD implements Packable {
    final private String band;
    final private String album;
    final private int year;

    public CD(String band, String album, int year) {
        this.band = band;
        this.album = album;
        this.year = year;
    }
    @Override
    public double weight() {
     return 0.1;
    }

    @Override
    public String toString() {
        return this.band + ": " + this.album + " (" + this.year + ")";
    }
    
    
    
    
}
