/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author petersims
 */
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> register;

    public VehicleRegistry() {
        this.register = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (!register.containsKey(licensePlate)) {
            register.put(licensePlate, owner);
            return true;
        } else {
            return false;
        }
    }

    public String get(LicensePlate licensePlate) {
        return register.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!register.containsKey(licensePlate)) {
            return false;
        } else {
            register.remove(licensePlate);
            return true;
        }
    }

    public void printLicensePlates() {
        for (LicensePlate plate : register.keySet()) {
            System.out.println(plate);
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();

        for (String owner : register.values()) {
            if (!owners.contains(owner)) {
                owners.add(owner);
                System.out.println(owner);
            }
        }
    }
}
