/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementazione1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author sherr
 */
public class Stack {
    
    public ObservableList<ComplexNumber> stack;
    private int capacity;
    
    public Stack(int capacity) {
        this.capacity = capacity;
        stack = FXCollections.observableArrayList();
    }
    
    public ObservableList getStack() {
        return stack;
    }
    
    public void push(ComplexNumber n) {
        stack.add(0, n);
    }
    
    public ComplexNumber pop() {
        return (ComplexNumber)stack.remove(0);
    }
    
    public ComplexNumber peek() {
        return (ComplexNumber)stack.get(0);
    }
    
    public int getSize() {
        return stack.size();
    }
    
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    
    public boolean isFull() {
        return stack.size() >= capacity;
    }
    
    
    
}
