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
    private String link;
    private Type type;
    private String image;

    public Exercise() {
    }

    public Exercise(int id, String name, String description, String link, Type type, String image) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.link = link;
        this.type = type;
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }


    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    public String getName() {
        return name;
    }

    public void setType(String name) {
        this.name = name;
    }
    
    
}
