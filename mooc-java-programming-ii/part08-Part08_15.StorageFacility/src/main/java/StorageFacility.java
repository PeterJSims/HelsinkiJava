
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

    HashMap<String, ArrayList<String>> units = new HashMap<>();

    public StorageFacility() {
        this.units = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.units.putIfAbsent(unit, new ArrayList<>());

        this.units.get(unit).add(item);

    }

    public ArrayList<String> contents(String storageUnit) {
        return this.units.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        if (this.units.containsKey(storageUnit)){
            units.get(storageUnit).remove(item);
        } else {
            units.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> unitsList = new ArrayList<>();
        for(String unit: units.keySet()){
            if(!units.get(unit).isEmpty()){
                unitsList.add(unit);
            }
        }
        return unitsList;
    }
}
