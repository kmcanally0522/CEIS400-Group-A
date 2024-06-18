/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;
// imports from SQL
// import java.util.ArrayList;

import java.util.ArrayList;
import java.util.List;

// import java.util.List;

/**
 *
 * @author kmcan
 */

public class Warehouse {
    private String location;
    private List<Object> inventory; // Assuming Material is another class
    private boolean isMainWarehouse;

    public Warehouse(String location, boolean isMainWarehouse) {
        this.location = location;
        this.inventory = new ArrayList<>();
        this.isMainWarehouse = isMainWarehouse;
    }
// Get Info
    public String getLocation() {
        return location;
    }

    public List<Object> getInventory() {
        return inventory;
    }

    public void addMaterial(Object material) {
        inventory.add(material);
    }

    public void removeMaterial(Object material) {
        inventory.remove(material);
    }

    public boolean getIsMainWarehouse() {
        return isMainWarehouse;
    }
}
