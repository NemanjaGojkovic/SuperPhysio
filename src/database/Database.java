/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Exercise;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Nemanja
 */
public class Database {
    
    private List<Exercise> exercises = new LinkedList<>();
    public static Database instance;
    
    private Database(){
        
    }
    
    public static Database getInstance() {
        if(instance==null){
            instance=new Database();
        }
        return instance;
    } 
    
    public List<Exercise> getExercises(){
        return exercises;
    }
    
    
}
