/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
import java.util.HashMap;

public class Abbreviations {

    HashMap<String, String> abbreviations = new HashMap<>();

    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    public void addAbbreviation(String abb, String exp) {
        this.abbreviations.put(abb, exp);
    }
    
    public boolean hasAbbreviation(String abb){
        return this.abbreviations.containsKey(abb);
    }
    
    public String findExplanationFor(String abb){
        return this.abbreviations.get(abb);
    }

}
