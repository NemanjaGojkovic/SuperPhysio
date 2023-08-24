/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package table;

import domain.Exercise;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nemanja
 */
public class ExerciseTableModel extends AbstractTableModel {
    
    private List<Exercise> exercises = new LinkedList<>();
    private List<Integer> reps = new LinkedList<>();
    private String[] columns = {"Ime vezbe","Broj ponavljanja"};
    
    public ExerciseTableModel(List<Exercise> exercises, List<Integer> reps){
        this.exercises=exercises;
        this.reps=reps;
    }

    @Override
    public int getRowCount() {
        if(exercises==null){
            return 0;
        }
        return exercises.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void removeExercise(int index) throws Exception {         
        exercises.remove(index);
        fireTableDataChanged();
    }
    
    public void addExercise(Exercise exercise, int rep) {
        exercises.add(exercise);
        reps.add(rep);
        fireTableDataChanged();
    }
    
    
    
}
