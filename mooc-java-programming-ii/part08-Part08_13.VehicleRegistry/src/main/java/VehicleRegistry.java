
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
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        this.registry = new HashMap<>();
    }

    public boolean add(LicensePlate plate, String owner) {
        if (registry.containsKey(plate)) {
            return false;
        } else {
            registry.put(plate, owner);
            return true;
        }
    }

    public String get(LicensePlate plate) {
        return registry.get(plate);
    }

    public boolean remove(LicensePlate plate) {
        if (registry.containsKey(plate)) {
            registry.remove(plate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        registry.keySet().forEach((plate) -> {
            System.out.println(plate);
        });
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(String owner: registry.values()){
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }

}
