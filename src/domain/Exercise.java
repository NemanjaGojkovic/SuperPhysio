/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Nemanja
 */
public class Exercise {
    private int id;
    private String name;
    private String description;
    private MuscleGroup group;
    private Position position;
    private String image;
    private int type;

    public Exercise() {
    }

    public Exercise(int id, String name, String description, MuscleGroup group, Position position, String image, int type) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.group = group;
        this.position = position;
        this.image = image;
        this.type = type;
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

    public MuscleGroup getGroup() {
        return group;
    }

    public void setGroup(MuscleGroup group) {
        this.group = group;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
    
    

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
}
