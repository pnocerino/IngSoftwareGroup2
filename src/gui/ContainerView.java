
package gui;

import javafx.geometry.Insets;
import javafx.scene.layout.HBox;

public class ContainerView extends HBox {
    
    public static InputAreaView inputArea;
    GUIController inputAreaController;
    StackView stackView;
    
    
    public ContainerView() {
        super();
        inputArea = new InputAreaView();
        inputArea.setSpacing(10);
        inputArea.setPadding(new Insets(20, 20, 20, 20));
        stackView = new StackView();
        inputAreaController = new GUIController(inputArea, stackView);
        stackView.setSpacing(10);
        stackView.setPadding(new Insets(20, 20, 20, 25));
        
        this.getStyleClass().add("container");
        this.getChildren().add(inputArea);
        this.getChildren().add(stackView);
    }
    
}
