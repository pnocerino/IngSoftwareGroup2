/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatriceinterfaccia;

import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author sherr
 */
public class StackView extends VBox {

    final int STACK_ITEMS = 12;
    
    Label memoryLabel;
    Label stackLabel[];
    
    public StackView() {
        super();
        this.getStyleClass().add("stackContainer");
        
        memoryLabel = new Label(); memoryLabel.getStyleClass().add("memoryLabel");
        stackLabel = new Label[STACK_ITEMS];
        memoryLabel.setText("Numeri complessi in memoria:");
        
        this.getChildren().add(memoryLabel);
        initStackLabel(); placeStackLabel(); 
    }
     
    public void initStackLabel() {
        for(int i = 0; i < STACK_ITEMS; i++) {
            stackLabel[i] = new Label();
            stackLabel[i].setText(Integer.toString(i + 1));
            stackLabel[i].getStyleClass().add("stackLabel");
        }
    }
    
    public void placeStackLabel() {
        GridPane pane = new GridPane();
        //pane.setAlignment(Pos.CENTER);
        for(int i = 0; i < STACK_ITEMS; i++) {
            pane.add(stackLabel[i], 0, i);
        }
        
        pane.setHgap(5); pane.setVgap(5); //pane.setAlignment(Pos.CENTER_RIGHT);
        this.getChildren().add(pane);
            
    }
    
    
    
}
