/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import database.DatabaseFactory;
import domain.Client;
import domain.Exercise;
import domain.MuscleGroup;
import domain.Position;
import domain.Workout;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import table.WorkoutTableModel;
import validator.Validator;

/**
 *
 * @author Nemanja
 */
public class AddExercisesForm extends javax.swing.JFrame {

    /**
     * Creates new form AddExercisesForm
     */
    
    
    
    private Client client;
    private String error;
    private List<Exercise> exercises;
    private List<MuscleGroup> muscleGroups = new LinkedList<>();
    private List<Position> positions = new LinkedList<>();
    private List<Exercise> choosenExercises; 
    
    public AddExercisesForm(Client client) {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.client=client;
        this.exercises = DatabaseFactory.getInstance().getExercises();
        Collections.addAll(this.muscleGroups, MuscleGroup.values());
        Collections.addAll(this.positions, Position.values());
        populateForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboExercise = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spinReps = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblExercises = new javax.swing.JTable();
        btnGenerate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnHelp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comboPosition = new javax.swing.JComboBox<>();
        comboMuscleGroup = new javax.swing.JComboBox<>();
        btnSearch = new javax.swing.JButton();
        btnSearchAll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Izaberi vezbu:");

        comboExercise.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Izaberi broj ponavljanja:");

        btnAdd.setText("Dodaj vežbu");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Izbaci vežbu");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        tblExercises.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblExercises);

        btnGenerate.setText("Generiši pdf");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Unošenje vežbi za klijenta");

        btnHelp.setText("?");

        jLabel4.setText("Pretraga po položaju:");

        jLabel5.setText("Pretraga po grupi mišića:");

        comboPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboMuscleGroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSearch.setText("Pretraži");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSearchAll.setText("Prikaži sve");
        btnSearchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnSearchAll, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGenerate))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(comboMuscleGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5)))
                                    .addComponent(comboExercise, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(95, 95, 95)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(spinReps, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(92, 92, 92)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboExercise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinReps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboMuscleGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(btnSearchAll))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerate)
                    .addComponent(btnHelp))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        error="";
        if(!checkFields()){
            JOptionPane.showMessageDialog(this, error, "Greska", JOptionPane.ERROR_MESSAGE);
            return;
        }
        WorkoutTableModel etm = (WorkoutTableModel) tblExercises.getModel();
        etm.addWorkout(new Workout((Exercise) comboExercise.getSelectedItem(), Integer.parseInt(spinReps.getValue().toString())));
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        try {
            int row = tblExercises.getSelectedRow();
            if(row==-1){
                JOptionPane.showMessageDialog(this, "Nijedna vezba nije izabrana");
                return;
            }
            WorkoutTableModel etm = (WorkoutTableModel) tblExercises.getModel();
            etm.removeWorkout(row);
        } catch (Exception ex) {
            Logger.getLogger(AddExercisesForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
      
        if(!Validator.getInstance().isNull(comboPosition.getSelectedItem()) &&
                !Validator.getInstance().isNull(comboMuscleGroup.getSelectedItem())){
            JComboBox comboBoxExercises = new JComboBox(new DefaultComboBoxModel(muscleGroupPositionFilter().toArray()));
            comboExercise.setModel(comboBoxExercises.getModel());
            comboExercise.setSelectedIndex(-1);
        }
        
        if(!Validator.getInstance().isNull(comboPosition.getSelectedItem()) &&
                Validator.getInstance().isNull(comboMuscleGroup.getSelectedItem())){
            JComboBox comboBoxExercises = new JComboBox(new DefaultComboBoxModel(positionFilter().toArray()));
            comboExercise.setModel(comboBoxExercises.getModel());
            comboExercise.setSelectedIndex(-1);
        }
        
        if(Validator.getInstance().isNull(comboPosition.getSelectedItem()) &&
                !Validator.getInstance().isNull(comboMuscleGroup.getSelectedItem())){
            JComboBox comboBoxExercises = new JComboBox(new DefaultComboBoxModel(muscleGroupFilter().toArray()));
            comboExercise.setModel(comboBoxExercises.getModel());
            comboExercise.setSelectedIndex(-1);
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnSearchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAllActionPerformed
        comboMuscleGroup.setSelectedIndex(-1);
        comboPosition.setSelectedIndex(-1);
        JComboBox comboBoxExercises = new JComboBox(new DefaultComboBoxModel(exercises.toArray()));
        comboExercise.setModel(comboBoxExercises.getModel());
        comboExercise.setSelectedIndex(-1);
    }//GEN-LAST:event_btnSearchAllActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnHelp;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchAll;
    private javax.swing.JComboBox<String> comboExercise;
    private javax.swing.JComboBox<String> comboMuscleGroup;
    private javax.swing.JComboBox<String> comboPosition;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spinReps;
    private javax.swing.JTable tblExercises;
    // End of variables declaration//GEN-END:variables

    private boolean checkFields() {
        boolean signal = true;
        
        if(Validator.getInstance().isNull(comboExercise.getSelectedItem())){
            error+="Polje vezba je prazno!\n";
            signal = false;
        }
        
        if(Validator.getInstance().isNotNumber(spinReps.getValue())){
            error+="Polje broj ponavljanja nije numericko!\n";
            signal = false;
        }
        
        if(Validator.getInstance().isEmpty(spinReps.getValue())){
            error+="Polje faza je prazno!\n";
            signal = false;
        }
        
        return signal;
    }

    private void populateForm() {
        WorkoutTableModel etm = new WorkoutTableModel();
        tblExercises.setModel(etm);
        
        JComboBox comboBoxExercises = new JComboBox(new DefaultComboBoxModel(exercises.toArray()));
        comboExercise.setModel(comboBoxExercises.getModel());
        
        JComboBox comboBoxMuscleGroup = new JComboBox(new DefaultComboBoxModel(muscleGroups.toArray()));
        comboMuscleGroup.setModel(comboBoxMuscleGroup.getModel());
        
        JComboBox comboBoxPosition = new JComboBox(new DefaultComboBoxModel(positions.toArray()));
        comboPosition.setModel(comboBoxPosition.getModel());
        
        
        comboExercise.setSelectedIndex(-1);
        comboMuscleGroup.setSelectedIndex(-1);
        comboPosition.setSelectedIndex(-1);
        
        
    }

    private List<Exercise> muscleGroupFilter() {
        List<Exercise> mg = new LinkedList<>();
        for (Exercise exercise : exercises) {
            if(exercise.getGroups().contains((MuscleGroup)comboMuscleGroup.getSelectedItem())){
                mg.add(exercise);
            }
        }
        return mg;
    }

    private List<Exercise> positionFilter() {
        List<Exercise> pos = new LinkedList<>();
        for (Exercise exercise : exercises) {
            if(exercise.getPosition().equals((Position)comboPosition.getSelectedItem())){
                pos.add(exercise);
            }
        }
        return pos;
    }


    private List<Exercise> muscleGroupPositionFilter() {
        List<Exercise> mix = new LinkedList<>();
        for (Exercise exercise : exercises) {
            if(exercise.getGroups().contains((MuscleGroup)comboMuscleGroup.getSelectedItem()) && 
                    exercise.getPosition().equals((Position)comboPosition.getSelectedItem())){
                mix.add(exercise);
            }
        }
        return mix;
    }

}
