/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.Exercise;
import domain.MuscleGroup;
import domain.Position;
import domain.Workout;
import java.util.LinkedList;
import java.util.List;


/**
 *
 * @author Nemanja
 */
public class DatabaseFactory {
    
    Exercise e1 = new Exercise();
    Exercise e2 = new Exercise();
    private List<Exercise> exercises = new LinkedList<>();
    
    public static DatabaseFactory instance;
    
    private DatabaseFactory(){
        Exercise e1 = new Exercise(0, "Ime jedan", "", MuscleGroup.NOGE, Position.STOMAK, "", 1);
        Exercise e2 = new Exercise(0, "Ime dva", "", MuscleGroup.LEDJA, Position.LEDJA, "", 2);
        
        exercises.add(e1);
        exercises.add(e2);
    }
    
    public static DatabaseFactory getInstance() {
        if(instance==null){
            instance=new DatabaseFactory();
        }
        return instance;
    } 
    
    public List<Exercise> getExercises(){
        return exercises;
    }
    
    
    
}
