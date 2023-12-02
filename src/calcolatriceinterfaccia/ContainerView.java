/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatriceinterfaccia;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

/**
 *
 * @author sherr
 */
public class ContainerView extends HBox {
    
    InputAreaView inputArea;
    InputAreaController inputAreaController;
    StackView stackView;
    
    public ContainerView() {
        super();
        inputArea = new InputAreaView();
        inputAreaController = new InputAreaController(inputArea);
        inputArea.setSpacing(10);
        inputArea.setPadding(new Insets(20, 20, 20, 20));
        stackView = new StackView();
        stackView.setSpacing(10);
        stackView.setPadding(new Insets(20, 20, 20, 25));
        
        this.getStyleClass().add("container");
        this.getChildren().add(inputArea);
        this.getChildren().add(stackView);
    }
    
}
