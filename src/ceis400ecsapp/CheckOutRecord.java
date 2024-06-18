/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;
import java.time.LocalDateTime;

/**
 *
 * @author kmcan
 */

 public class CheckOutRecord {
     //attributes
    private int recordId;
    private int employeeId;
    private int toolId;
    private LocalDateTime checkOutTime;
    private LocalDateTime returnTime;
    // constructors
    public CheckOutRecord(int recordId, int employeeId, int toolId, LocalDateTime checkOutTime) {
        this.recordId = recordId;
        this.employeeId = employeeId;
        this.toolId = toolId;
        this.checkOutTime = checkOutTime;
        this.returnTime = null;
    }
    // Get Info
    public int getRecordId() {
        return recordId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public int getToolId() {
        return toolId;
    }

    public LocalDateTime getCheckOutTime() {
        return checkOutTime;
    }

    public LocalDateTime getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(LocalDateTime returnTime) {
        this.returnTime = returnTime;
    }
}


