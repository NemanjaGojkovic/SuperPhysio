/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validator;

/**
 *
 * @author Nemanja
 */
public class Validator {
    private static Validator instance;

    private Validator() {
    }
    
    public static Validator getInstance() {
        if(instance==null){
            instance=new Validator();
        }
        return instance;
    }
    
    public boolean isEmpty(Object object){
        if(object.toString().isBlank() || object.toString().isEmpty()){
            return true;
        }
        return false;
    }
    
    public boolean isNotNumber(Object object){
        try {
            Integer.parseInt(object.toString());
        } catch (Exception e) {
            return true;
        }
        return false;
    }
    
    public boolean isNull(Object object){
        if (object == null) {
            return true;
        }
        return false;
    }
    
}
