/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.time.LocalDate;

/**
 *
 * @author Nemanja
 */
public class Client {
    private String firstname;
    private String lastname;
    private LocalDate birthday;
    private LocalDate startingDate;
    private int phase;
    private String diagnose;

    public Client() {
    }

    public Client(String firstname, String lastname, LocalDate birthday, LocalDate startingDate, int phase, String diagnose) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.startingDate = startingDate;
        this.phase = phase;
        this.diagnose = diagnose;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }
    
    
    
}
