/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import domain.Exercise;
import domain.MuscleGroup;
import domain.Position;
import domain.Workout;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nemanja
 */
public class WorkoutTableModel extends AbstractTableModel {
    
    private List<Workout> workouts = new LinkedList<>();
    private String[] columns = {"Ime vezbe", "Broj ponavljanja"};
    
    public WorkoutTableModel(){
        
    }

    @Override
    public int getRowCount() {
        if(workouts==null){
            return 0;
        }
        return workouts.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    public String getColumnName(int column) {
        return columns[column];
    }
    


    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch (columnIndex) {
            case 0:
                return workouts.get(rowIndex).getExercise().getName();
            case 1:
                return workouts.get(rowIndex).getReps();
            default:
                return "n/a";
        }
    }
    
    public void removeWorkout(int index) throws Exception {         
        workouts.remove(index);
        fireTableDataChanged();
    }
    
    public void addWorkout(Workout workout) {
        workouts.add(workout);
        fireTableDataChanged();
    }
    
    
    
}
