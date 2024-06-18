/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;

/**
 *
 * @author kmcan
 */
public class Employee {
        
    //attributes
    private int id;
    private String firstName;
    private String lastName;
    private String role;

    //Constructors
    public Employee(){   
        id = 0;
        firstName = "N/A";
        lastName = "N/A";
        role = "None";
    }

    public Employee(int id, String firstName, String lastName, String role){
        this.id = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.role = role;
    }


   //Get info    
    public int getId(){
       return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getRole(){
        return role;
    }
    
    //Set info
    public void setId(int id){
        this.id = id;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setRole( String role){
        this.role = role;
    }
  
}
