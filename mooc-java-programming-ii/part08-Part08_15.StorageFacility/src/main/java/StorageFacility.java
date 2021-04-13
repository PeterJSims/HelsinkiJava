
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
public class StorageFacility {
    HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        storage.putIfAbsent(unit, new ArrayList<>());
        storage.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String unit){
        return storage.getOrDefault(unit, new ArrayList<>());

    }
    
    public void remove(String storageUnit, String item){
        storage.get(storageUnit).remove(item);
        if(storage.get(storageUnit).isEmpty()) {
            storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> returnedUnits = new ArrayList<>();
        for (String facility: storage.keySet()){
            if (storage.get(facility).size() > 0){
                returnedUnits.add(facility);
            }
        }
        return returnedUnits;
    }
    
}
