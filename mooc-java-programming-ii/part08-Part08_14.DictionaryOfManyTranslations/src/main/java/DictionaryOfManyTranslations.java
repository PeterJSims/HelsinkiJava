
import java.util.ArrayList;
import java.util.HashMap;

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
    private HashMap<String, ArrayList<String>> definitions;

    public DictionaryOfManyTranslations() {
        this.definitions = new HashMap<>();
    }
    
    public void add(String word, String translation) {
        this.definitions.putIfAbsent(word, new ArrayList<>());
        definitions.get(word).add(translation);
    }
    
    public ArrayList<String> translate(String word){
        return definitions.getOrDefault(word, new ArrayList<>());
    }
    
    public void remove(String word){
        this.definitions.remove(word);
    }
    
}
