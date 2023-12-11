/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableMap;

/**
 *
 * @author pierl
 */
public class Variables {
    
    private ObservableMap<Character, Variable> variables;
    private Variable currentVariable;

    public Variables() {
        
        variables = FXCollections.observableHashMap();
        
    }

    public Variable getCurrentVariable() {
        return currentVariable;
    }
    
    public void add(Variable var){
        variables.put(var.getName(), var);
    }
    
    public Variable remove(char name){
        
        return variables.remove(name);
    }
    
    public Variable search(char name){
        
        return variables.get(name);
    }
    
    
    
    
}