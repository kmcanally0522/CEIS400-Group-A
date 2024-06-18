/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ceis400ecsapp;

/**
 *
 * @author kmcan
 */
public class ToolFactory {
    public static Tool createTool(String toolType, int id, String name, String type, String status, String specialSkillsRequired) {
        if (toolType.equals("general")) {
            return new Tool(id, name, type, status);
        } else if (toolType.equals("special")) {
            return new Equipment(id, name, type, status, specialSkillsRequired);
        } else {
            throw new IllegalArgumentException("Invalid tool type");
        }
    }
}
