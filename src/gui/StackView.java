
package gui;

import scientificcalculator.complexnumber.ComplexNumber;
import scientificcalculator.complexnumber.Stack;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.VBox;

public class StackView extends VBox {
    
    Label memoryLabel;
    
    public ListView<ComplexNumber> listView;
    public Stack stackClass = new Stack(24);
    public ObservableList<ComplexNumber> stackList = stackClass.getStack();
    
    public StackView() {
        super();
        this.getStyleClass().add("stackContainer");
        
        memoryLabel = new Label(); memoryLabel.getStyleClass().add("memoryLabel");
        memoryLabel.setText("Numeri complessi in memoria:");
        this.getChildren().add(memoryLabel);
        listView = new ListView(); listView.getStyleClass().add("stackLabel");
        listView.setItems(stackList);
        listView.setCellFactory(param -> new ListCell<ComplexNumber>() {
            @Override
            protected void updateItem(ComplexNumber item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null || item.toString() == null) {
                    setText(null);
                } else {
                    setText(item.toString());
                    setTooltip(new Tooltip(item.toString()));
                }
            }
        });
        
        
        this.getChildren().add(listView);
    }
}
