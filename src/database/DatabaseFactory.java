/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import com.fasterxml.jackson.databind.ObjectMapper;
import domain.Exercise;
import domain.MuscleGroup;
import domain.Position;
import domain.Workout;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Nemanja
 */
public class DatabaseFactory {
    
//    Exercise e1 = new Exercise();
//    Exercise e2 = new Exercise();
    private List<Exercise> exercises = new LinkedList<>();
    
    public static DatabaseFactory instance;
    
    private DatabaseFactory(){
        try {
            ObjectMapper om = new ObjectMapper();
            
            File file = new File("exercises.json");
            exercises = om.readValue(file, om.getTypeFactory().constructCollectionType(List.class, Exercise.class));
        } catch (IOException ex) {
            Logger.getLogger(DatabaseFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static DatabaseFactory getInstance(){
        if(instance==null){
            instance=new DatabaseFactory();
        }
        return instance;
    } 
    
    public List<Exercise> getExercises(){
        return exercises;
    }
    
    
    
}
