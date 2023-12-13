
package scientificcalculator.complexnumber.variables;

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
    
    public ObservableMap<Character, Variable> getMap(){
        return variables;
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
