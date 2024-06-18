/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;

/**
 *
 * @author kmcan
 */
public class Tool {
    //attributes
    private int toolId;
    private String tName;
    private String tType;
    private String tStatus;
    
    //constructor
    public Tool(){
        toolId = 0;
        tName = "N/A";
        tType = "N/A";
        tStatus = "N/A";    
    }
    
    public Tool( int toolId, String tName, String tType, String tStatus){
        this.toolId = toolId;
        this.tName = tName;
        this.tType = tType;
        this.tStatus = tStatus;
    }
    
    //Get statements
    public int getToolId(){
        return toolId;
    }
    public String getTName(){
        return tName;
    }
    
    public String getTType(){
        return tType;
    }
    
    public String getTStatus(){
        return tStatus;
    }
    
    //Set statements
    public void setToolId(int toolId){
        this.toolId = toolId;
    }
    
    public void setTName(String tName){
        this.tName = tName;
    }
    
    public void setTType(String tType){
        this.tType = tType;
    }
    
    public void setTStatus(String tStatus){
        this.tStatus = tStatus;
    }
}
