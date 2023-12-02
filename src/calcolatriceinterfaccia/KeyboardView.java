/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcolatriceinterfaccia;

import static calcolatriceinterfaccia.CalcolatriceInterfaccia.currentVariable;
import javafx.collections.FXCollections;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


/**
 *
 * @author sherr
 */
public class KeyboardView extends HBox {
    
    //public TilePane var;
    String test[] = { "a", "b", "c", "d", "e" };
    public Label chooseVar;
    public ComboBox varMenu;
    
    public Button numberKeys[];
    public Button operatorKeys[];
    public Button otherButton[];
    
    public final int DIGITS = 10; //+3
    public final int OPERATORS = 6; //+1
    public final int OTHER = 8;
    
    
    
    public KeyboardView() {
        super();
        
        chooseVar = new Label();
        varMenu = new ComboBox(FXCollections.observableArrayList(test));
        //var = new TilePane(varMenu); var.getStyleClass().add("varTilePane");
        initDigitsButtons();
        initOperatorButtons(); 
        initOtherButtons(); 
        
        placeDigitsButtons();
        placeOperatorButtons();
        placeOtherButtons();
        
        this.setSpacing(20);
        this.setPadding(new Insets(20, 0, 0, 0));
    }
    
    private void initDigitsButtons() {
        numberKeys = new Button[DIGITS + 4];
        for(int i = 0; i < DIGITS - 1; i++) {
            numberKeys[i] = new Button();
            numberKeys[i].setText(Integer.toString(i + 1));
            numberKeys[i].getStyleClass().add("keysButton");
        }
        numberKeys[DIGITS] = new Button();
        numberKeys[DIGITS].setText("0");
        numberKeys[DIGITS].getStyleClass().add("keysButton");
        
        /*numberKeys[DIGITS + 1] = new Button();
        numberKeys[DIGITS + 1].setText("↵");
        numberKeys[DIGITS + 1].getStyleClass().add("keysButton");
        //numberKeys[DIGITS + 1].setStyle("-fx-font-family:Arial;-fx-font-size:40");*/
        
        numberKeys[DIGITS + 1] = new Button();
        numberKeys[DIGITS + 1].setText("i");
        numberKeys[DIGITS + 1].getStyleClass().add("keysButton");
        
        numberKeys[DIGITS + 2] = new Button();
        numberKeys[DIGITS + 2].setText(".");
        numberKeys[DIGITS + 2].getStyleClass().add("keysButton");
        
        
    }
    
    private void initOperatorButtons() {
        operatorKeys = new Button[OPERATORS + 2];
        
        operatorKeys[0] = new Button(); operatorKeys[0].setText("↩");
        operatorKeys[0].getStyleClass().add("enterButton"); //operatorKeys[0].setStyle("-fx-font-size: 50px; -fx-background-color: linear-gradient(from 25px 25px to 100px 100px, #226007, #125703);");
        operatorKeys[1] = new Button(); operatorKeys[1].setText("←");
        operatorKeys[1].getStyleClass().add("backButton"); //operatorKeys[1].setStyle("-fx-font-size: 40px; -fx-padding: 0 0 5 0; -fx-text-fill: linear-gradient(from 25px 25px to 100px 100px, #dc145a, #c71d1d);");
        operatorKeys[2] = new Button(); operatorKeys[2].setText("+");
        operatorKeys[2].getStyleClass().add("operatorButton");
        operatorKeys[3] = new Button(); operatorKeys[3].setText("-");
        operatorKeys[3].getStyleClass().add("operatorButton");
        operatorKeys[4] = new Button(); operatorKeys[4].setText("×");
        operatorKeys[4].getStyleClass().add("operatorButton");
        operatorKeys[5] = new Button(); operatorKeys[5].setText("/");
        operatorKeys[5].getStyleClass().add("operatorButton");
        operatorKeys[6] = new Button(); operatorKeys[6].setText("√");
        operatorKeys[6].getStyleClass().add("operatorButton");
        operatorKeys[7] = new Button(); operatorKeys[7].setText("±"); 
        operatorKeys[7].getStyleClass().add("operatorButton");
        
        //⌫
        
    }
    
    private void initOtherButtons() {    
        otherButton = new Button[OTHER];
        
        otherButton[0] = new Button(); otherButton[0].setText("Clear");
        otherButton[0].getStyleClass().add("clearButton"); otherButton[0].setTooltip(new Tooltip("Ripulisce lo stack."));
        otherButton[1] = new Button(); otherButton[1].setText("Drop");
        otherButton[1].getStyleClass().add("otherButton");
        otherButton[2] = new Button(); otherButton[2].setText("Dup");
        otherButton[2].getStyleClass().add("otherButton");
        otherButton[3] = new Button(); otherButton[3].setText("Over");
        otherButton[3].getStyleClass().add("otherButton");
        otherButton[4] = new Button(); otherButton[4].setText(">" + currentVariable);
        otherButton[4].getStyleClass().add("otherButton");
        otherButton[5] = new Button(); otherButton[5].setText("<" + currentVariable);
        otherButton[5].getStyleClass().add("otherButton");
        otherButton[6] = new Button(); otherButton[6].setText("+" + currentVariable);
        otherButton[6].getStyleClass().add("otherButton");
        otherButton[7] = new Button(); otherButton[7].setText("-" + currentVariable);
        otherButton[7].getStyleClass().add("otherButton");
        
        chooseVar.setText("Scegli una variabile:"); chooseVar.getStyleClass().add("varChooseLabel");
        varMenu.getStyleClass().add("varMenu");
    }
    
    private void placeDigitsButtons() {
        GridPane pane = new GridPane();
        //pane.setAlignment(Pos.CENTER);
        for(int i = 0; i < DIGITS - 1; i++) {
            pane.add(numberKeys[i], i % 3, i / 3);
        }
        pane.add(numberKeys[DIGITS], 1, 3);
        pane.add(numberKeys[DIGITS + 1], 0, 3);
        pane.add(numberKeys[DIGITS + 2], 2, 3);
        
        pane.setHgap(5); pane.setVgap(5);
        this.getChildren().add(pane);
            
    }
    
    private void placeOperatorButtons() {
        GridPane opPane = new GridPane();
        for(int i = 0; i < OPERATORS + 2; i++) {
            opPane.add(operatorKeys[i], i % 2, i / 2);
        }
        opPane.setHgap(5); opPane.setVgap(5);
        this.getChildren().add(opPane);
        
        
        
    }
    
    private void placeOtherButtons() {
        GridPane vPane = new GridPane();
        //pane.setAlignment(Pos.CENTER);
        for(int i = 0; i < OTHER/2; i++) {
            vPane.add(otherButton[i], 0, i);
        }
        for(int i = 0; i < OTHER/2; i++) {
            vPane.add(otherButton[i + 4], 1, i);
        }
        vPane.add(chooseVar, 0, 5, 2, 1);
        vPane.add(varMenu, 0, 6, 2, 1);
        vPane.setHgap(5); vPane.setVgap(5);
        this.getChildren().add(vPane);
        
    }
    
}
