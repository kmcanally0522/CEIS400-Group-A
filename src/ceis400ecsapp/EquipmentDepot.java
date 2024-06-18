/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;
import java.util.*;
// import SQL array

/**
 *
 * @author kmcan
 */

public class EquipmentDepot {
    private static EquipmentDepot instance;
    private String location;
    private List<Tool> inventory;

    private EquipmentDepot(String location) {
        this.location = location;
        this.inventory = new ArrayList<>();
    }
// Get Info
    public static synchronized EquipmentDepot getInstance(String location) {
        if (instance == null) {
            instance = new EquipmentDepot(location);
        }
        return instance;
    }

    public List<Tool> getInventory() {
        return inventory;
    }

    public void addTool(Tool tool) {
        inventory.add(tool);
    }

    public void removeTool(Tool tool) {
        inventory.remove(tool);
    }

    public String getLocation() {
        return location;
    }
}

    


