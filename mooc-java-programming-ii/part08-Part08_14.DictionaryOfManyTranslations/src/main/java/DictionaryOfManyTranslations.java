
import java.util.HashMap;
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
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();
    
    public DictionaryOfManyTranslations(){
        this.dictionary = new HashMap<>();
    }
    
    public void add(String word, String translation){
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        
        ArrayList<String> wordToDefine = this.dictionary.get(word);
        
        wordToDefine.add(translation);

    }
    
    public ArrayList<String> translate(String word){
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.dictionary.remove(word);
    }
    
}
