/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;

/**
 *
 * @author kmcan
 */

//Child class of Parent Employee Class (dependancy)
public class MaintenanceEmployee extends Employee {
    
    //attributes
    private String assignedBuilding;
    
    //constructor
    public MaintenanceEmployee(int id, String firstName, String lastName, String role, String assignedBuilding){
        super(id, firstName, lastName, role);
        
        this.assignedBuilding = assignedBuilding;
    }
    //Get info
    public String getAssignedBuilding(){
        return assignedBuilding;
    }
    //Set info
    public void setAssignedBuilding( String assignedBuilding){
        this.assignedBuilding = assignedBuilding;
    }
    
}
