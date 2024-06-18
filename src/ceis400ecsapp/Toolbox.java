/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;
import java.util.*;

/**
 *
 * @author kmcan
 */
public class Toolbox {
    
    //attributes
    private int toolId;
    private int employeeId;
    private List<Tool> tools = new ArrayList<>();

    // Constructor
    public Toolbox(){
        toolId = 0;
        employeeId = 0;
        //Need list info added to constructor
    }
    public Toolbox(int toolId, int employeeId){  //list info needed
        this.toolId = toolId;
        this.employeeId = toolId;
        //list needed
    } 
    
    //Get info
    public int setToolId(){
        return toolId;
    }
    public int setEmployeeId(){
        return employeeId;
    }
    
    //Set info
    public void setToolId(int toolId){
        this.toolId = toolId;
    }
    
    public void setEmployeeId( int employeeId){
        this.employeeId = employeeId;
    }
    
    public List<Tool> getTools() {
        return tools;
    }

    //add/remove tool
    public void addTool(Tool tool) {
        tools.add(tool);
    }

    public void removeTool(Tool tool) {
        tools.remove(tool);
    }

}
