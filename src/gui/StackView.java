/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

//import static complexnumber.Stack.stack;
import complexnumber.ComplexNumber;
import complexnumber.Stack;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

/**
 *
 * @author sherr
 */
public class StackView extends VBox {
    
    Label memoryLabel;
    
    public ListView<ComplexNumber> listView;
    //private TableColumn<ComplexNumber, String> stackColumn;
    public Stack stackClass = new Stack();
    public ObservableList<ComplexNumber> stackList = stackClass.getStack();
    
    public StackView() {
        super();
        this.getStyleClass().add("stackContainer");
        
        memoryLabel = new Label(); memoryLabel.getStyleClass().add("memoryLabel");
        memoryLabel.setText("Numeri complessi in memoria:");
        this.getChildren().add(memoryLabel);
        listView = new ListView(); listView.getStyleClass().add("stackLabel");
        listView.setItems(stackList);
        initTest();
        listView.setCellFactory(param -> new ListCell<ComplexNumber>() {
            @Override
            protected void updateItem(ComplexNumber item, boolean empty) {
                super.updateItem(item, empty);

                if (empty || item == null || item.toString() == null) {
                    setText(null);
                } else {
                    setText(item.toString());
                }
            }
        });
        this.getChildren().add(listView);
    }
    
    public void initTest() {
        stackClass.push(new ComplexNumber("2+2i"));
        stackClass.push(new ComplexNumber("2i"));
        stackClass.push(new ComplexNumber("-4i"));
        stackClass.push(new ComplexNumber("2+2i"));
        stackClass.push(new ComplexNumber("2i"));
        stackClass.push(new ComplexNumber("-4i"));
        stackClass.push(new ComplexNumber("2+2i"));
        stackClass.push(new ComplexNumber("2i"));
        stackClass.push(new ComplexNumber("-4i"));
        stackClass.push(new ComplexNumber("53i"));
        stackClass.push(new ComplexNumber("2i"));
        stackClass.push(new ComplexNumber("0"));
        stackClass.push(new ComplexNumber("28.32i"));
        stackClass.push(new ComplexNumber("2i"));
        stackClass.push(new ComplexNumber("-4i"));
        stackClass.push(new ComplexNumber("53i"));
        stackClass.push(new ComplexNumber("2i"));
        stackClass.push(new ComplexNumber("11.3"));
    }
    
    

    /*final int STACK_ITEMS = 12;
    
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
            //stackLabel[i].setText(Integer.toString(i + 1));
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
            
    }*/
    
    
    
}
