/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.List;

/**
 *
 * @author Nemanja
 */
public class Exercise {
    private int id;
    private String name;
    private String description;
    private List<MuscleGroup> groups;
    private Position position;
    private String image;

    public Exercise() {
    }

    public Exercise(int id, String name, String description, List<MuscleGroup> groups, Position position, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groups = groups;
        this.position = position;
        this.image = image;
    }

    
    
    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getName() {
        return name;
    }

    public void setType(String name) {
        this.name = name;
    }

    public List<MuscleGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<MuscleGroup> groups) {
        this.groups = groups;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

   
    @Override
    public String toString() {
        return name;
    }
    
    
    
    
}
