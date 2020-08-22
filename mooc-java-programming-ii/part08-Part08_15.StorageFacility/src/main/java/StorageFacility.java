
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

    private HashMap<String, ArrayList<String>> facility;

    public StorageFacility() {
        this.facility = new HashMap<>();
    }

    public void add(String unit, String item) {
        facility.putIfAbsent(unit, new ArrayList<>());
        facility.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return facility.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        if(facility.containsKey(storageUnit)){
            facility.get(storageUnit).remove(item);
        } else {
            facility.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> unitsList = new ArrayList<>();
        for(String unit: facility.keySet()){
            if(!facility.get(unit).isEmpty()){
                unitsList.add(unit);
            }
        }
        return unitsList;
    }

}
